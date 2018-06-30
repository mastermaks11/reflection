package by.itacademi.ziptext;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user on 30.06.2018.
 */
public class UnarchiveTextTest {
    @Test
    public void textUnarchive() {
        UnarchiveText unarchiveText = new UnarchiveText("Hel3o");
        Assert.assertNotNull(unarchiveText.reverseText());
        Assert.assertEquals("helllo", unarchiveText.reverseText());
    }
}
