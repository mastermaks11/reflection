package by.itacademi.ziptext;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user on 30.06.2018.
 */
public class TextHandlerTest {
    @Test
    public void textHandlerTest() {
        TextHandler textHandler = new TextHandler();
        Assert.assertEquals("i l2ove2 j3ava3", textHandler.compressText("i llovee jjjavaaa"));
        Assert.assertEquals("i llovee jjjavaaa", textHandler.unzipText("i l2ove2 j3ava3"));
    }
}
