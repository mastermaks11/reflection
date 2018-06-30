package by.itacademi.ziptext;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user on 30.06.2018.
 */
public class CompressionOfTextTest {
    @Test
    public void textRerurnNotNull() {
        CompressionOfText compressionOfText = new CompressionOfText("helllo");
        Assert.assertNotNull(compressionOfText.archivingText());
        Assert.assertEquals("hel3o", compressionOfText.archivingText());
    }
}
