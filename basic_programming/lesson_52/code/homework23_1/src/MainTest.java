import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main m;

    @BeforeEach
    public void init(){
        m = new Main();
    }

    @Test
    public void findMinOrMax_test_emptyList_throwsException() {
      //  assertEquals(null,m.findMinOrMax(Arrays.asList()));
        assertThrows(EmptyListException.class,()->m.findMinOrMax(Arrays.asList()));
      //  assertThrows(EmptyListException.class,()->m.findMinOrMax(Arrays.asList("a","bb")));
    }

    @Test
    public void findMinOrMax_test_oneElt() throws EmptyListException{
        assertEquals("a",m.findMinOrMax(Arrays.asList("a")));
    }


    @Test
    public void findMinOrMax_test_shortFirst() throws EmptyListException {
        List<String> actual = Arrays.asList("bb","a","ff","ddd");
        assertEquals("a",m.findMinOrMax(actual));
    }

    @Test
    public void findMinOrMax_test_longFirst() throws EmptyListException {
        List<String> actual = Arrays.asList("bb","aaa","ff","d");
        assertEquals("aaa",m.findMinOrMax(actual));
    }
}