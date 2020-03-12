package solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class SolutionTest {

    @Before
    public void setUp() {
        Vocabulary.initializeVocabulary();
    }

//    private String translateToMorse(String s) {
//        return s;
//    }

//    private String translateToEng(String s) {
//        return "s";
//    }

    @Test
    public void shouldTranslateMorseToEnglish() {
        //SolutionTest  obj = new SolutionTest();
        Character result = Vocabulary.translateToEng(".-");
        String expected = "a";
        Assert.assertEquals(expected, Character.toString(result));
    }

    @Test
    public void shouldTranslateEnglishToMorse() {
        //SolutionTest  obj = new SolutionTest();
        String result = Vocabulary.translateToMorse('a');
        String expected = ".-";
        Assert.assertEquals(expected, result);
    }


//    @Test
//    public void shouldReturnTrue() {
//        //SolutionTest obj = new SolutionTest();
//        String result = Vocabulary.translateToMorse("abc");
//        String expected ="*- -*** -*-*";
//        Assert.assertEquals(expected, result);
//    }


//    @Test
//    public void shouldReturnTrueWhenTranslateToMorse() {
//        SolutionTest obj = new SolutionTest();
//        String result = obj.translateToMorse("abc");
//        String expected ="*- -*** -*-*";
//        Assert.assertEquals(expected, result);
//    }

    //
//    @Test
//    public void shouldReturnInvalid() {
//        //SolutionTest obj = new SolutionTest();
//        String result = Vocabulary.translateToEng( "*");
//        String expected ="Invalid";
//        Assert.assertNotEquals(expected, result);
//    }

//    @Test
//    public void shouldReturnValidWhenTranslatingToEng() {
//        SolutionTest obj = new SolutionTest();
//        String result = obj.translateToEng( "*");
//        String expected = "e";
//        Assert.assertEquals(expected, result);
//    }
}
