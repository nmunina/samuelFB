package solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    @Before
    public void setUp() {
        Vocabulary.initializeVocabulary();
    }

    @Test
    public void shouldTranslateMorseToEnglish() {
        char result = Vocabulary.translateToEng(".-");
        String expected = "a";
        Assert.assertEquals(expected, Character.toString(result));
    }

    @Test
    public void shouldTranslateEnglishToMorse() {
        String result = Vocabulary.translateToMorse('a');
        String expected = ".-";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void shouldNotTranslateEnglishToMorse() {
        String result = Vocabulary.translateToMorse('a');
        String expected = ".--";
        Assert.assertNotEquals(expected, result);
    }
}
