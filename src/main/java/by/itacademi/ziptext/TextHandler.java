package by.itacademi.ziptext;

/**
 * Created by user on 30.06.2018.
 */
public class TextHandler {
    public String compressText(String text) {
        CompressionOfText compressionOfText = new CompressionOfText(text);
        return compressionOfText.archivingText();
    }

    public String unzipText(String text) {
        UnarchiveText unarchiveText = new UnarchiveText(text);
        return unarchiveText.reverseText();
    }
}
