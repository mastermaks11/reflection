package by.itacademi.ziptext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 30.06.2018.
 */
public class CompressionOfText {
    private String text;

    public CompressionOfText(String text) {
        this.text = text;
    }

    public String archivingText() {
        Pattern pattern = Pattern.compile("([a-z])\\1+");
        Matcher matcher = pattern.matcher(text);
        String newText = text;
        while (matcher.find()) {
            newText = newText.replaceFirst(pattern.pattern(), "$1" + matcher.group().length());
        }
        return newText;
    }
}

