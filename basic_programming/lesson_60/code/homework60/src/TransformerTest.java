import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransformerTest {
    Transformer transformer;
    String input;

    @BeforeEach
    public void init(){
        transformer = new Transformer();
        input = "aaa BBBB dEF cDkls bbb";
    }

    @Test
    public void test_empty(){
        input = "";
        WordsTransformerLowerCase w = new WordsTransformerLowerCase();
        assertEquals(input,transformer.transform(input,w));
    }


    @Test
    public void test_4_lowerCase(){
      String  expected = "aaa bbbb dEF cDkls bbb";
      WordsTransformerLowerCase w = new WordsTransformerLowerCase();
        assertEquals(expected,transformer.transform(input,w));
    }


    @Test
    public void test_when_3_then_toUpperCase(){
        String  expected = "AAA BBBB DEF cDkls BBB";
        WordsTransformerUpperCase w = new WordsTransformerUpperCase();
        assertEquals(expected,transformer.transform(input,w));
    }


    @Test
    public void test_when_5_then_stars(){
        String  expected = "aaa BBBB dEF ***** bbb";
        WordsTransformerStar w = new WordsTransformerStar();
        assertEquals(expected,transformer.transform(input,w));
    }

    @Test
    public void test_when_3_then_nothingChanged(){
        String  expected = "a BBBBBBBBBBBBBBBBBBBBBBBBBBB";
        WordsTransformerUpperCase w = new WordsTransformerUpperCase();
        assertEquals(expected,transformer.transform(expected,w));
    }

}