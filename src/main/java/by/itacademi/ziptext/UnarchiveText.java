package by.itacademi.ziptext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 30.06.2018.
 */
public class UnarchiveText {
    private String text;
    private Pattern pattern;
    private Matcher matcher;

    public UnarchiveText(String text) {
        this.text = text;
        pattern = Pattern.compile("([1-9])");
        matcher = pattern.matcher(text);
    }

    public String reverseText() {
        int countElementDublicate;
        String newText = "";
        int startTextUnarchive = 0;
        int endTextUnarchive = 0;
        while (matcher.find()) {
            endTextUnarchive = text.indexOf(matcher.group(), startTextUnarchive);
            newText += text.substring(startTextUnarchive, text.indexOf(matcher.group(), startTextUnarchive));
            countElementDublicate = Integer.parseInt(matcher.group());
            while (countElementDublicate - 1 != 0) {
                newText = newText + text.charAt(text.indexOf(matcher.group(), startTextUnarchive) - 1);
                --countElementDublicate;
            }
            startTextUnarchive = text.indexOf(matcher.group(), startTextUnarchive) + 1;
        }
        if (endTextUnarchive != text.length() - 1) newText += text.substring(endTextUnarchive + 1, text.length());
        return newText;
    }
}
