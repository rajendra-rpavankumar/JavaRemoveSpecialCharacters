import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Pavan Kumar on 30/04/2017.
 */
public class RemoveSpecialCharactersTest {
    RemoveSpecialCharacters removeSpecialCharacters;
    @Before
    public void setUp() throws Exception {
        removeSpecialCharacters = new RemoveSpecialCharacters();
    }

    @Test
    public void removeSpecChar() throws Exception {
        Assert.assertEquals("abcd",removeSpecialCharacters.removeSpecChar("ab#$cd"));
    }

}