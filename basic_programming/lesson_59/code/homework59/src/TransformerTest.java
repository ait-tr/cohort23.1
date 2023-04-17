import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Function;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransformerTest {

    private  Transformer transformer;
    String input;
    Predicate<String>predicate;
    Function<String,String>function;

    @BeforeEach
    public void init(){
        transformer = new Transformer();
        input = "AAA BBBB dEF cDkls bBb";
    }

    @Test
    public void test_empty(){
        input ="";
        predicate = s -> s.length() == 3;
        function = s -> s.toLowerCase();

        assertEquals(input,transformer.transforming(input,predicate,function));
    }

    @Test
    public void test_3_lowerCase(){
        String expected ="aaa BBBB def cDkls bbb";
        predicate = s -> s.length() == 3;
        function = s -> s.toLowerCase();

        assertEquals(expected,transformer.transforming(input,predicate,function));
    }

    @Test
    public void test_3_upperCase(){
        String expected ="AAA BBBB DEF cDkls BBB";
        predicate = s -> s.length() == 3;
        function = s -> s.toUpperCase();

        assertEquals(expected,transformer.transforming(input,predicate,function));
    }

    @Test
    public void test_4_lowerCase(){
        String expected ="AAA bbbb dEF cDkls bBb";
        predicate = s -> s.length() == 4;
        function = s -> s.toLowerCase();

        assertEquals(expected,transformer.transforming(input,predicate,function));
    }

    @Test
    public void test_4_upperCase(){
        String expected ="AAA BBBB dEF cDkls bBb";
        predicate = s -> s.length() == 4;
        function = s -> s.toUpperCase();

        assertEquals(expected,transformer.transforming(input,predicate,function));
    }


    @Test
    public void test_5Stars(){
        String expected ="AAA BBBB dEF ***** bBb";
        predicate = s -> s.length() == 5;
        function = s -> s = "*****";

        assertEquals(expected,transformer.transforming(input,predicate,function));
    }

    @Test
    public void test_nothingChanged(){
        input = "aa bbbbbbbbbbbbbbbbbb";
        predicate = s -> s.length() == 5;
        function = s -> s = "*****";

        assertEquals(input,transformer.transforming(input,predicate,function));
    }


}
