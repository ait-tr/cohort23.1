import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapExercisesTest {
    private MapExercises mapExercises;

    @BeforeEach
    public void init(){
        mapExercises = new MapExercises();
    }

    @Test
    public void wordMultiple_test_true(){
        String[] actual = new String[]{"a","b","a","c","b"};

        Map<String,Boolean> expected = new HashMap<>();
        expected.put("a",true);
        expected.put("b",true);
        expected.put("c",false);

        assertEquals(expected,mapExercises.wordMultiple(actual));
    }

    @Test
    public void wordMultiple_test_same(){
        String[] actual = new String[]{"c","c","c","c"};

        Map<String,Boolean> expected = new HashMap<>();
        expected.put("c",true);

      assertEquals(expected,mapExercises.wordMultiple(actual));
    }


    @Test
    public void wordMultiple_test_allFalse(){
        String[] actual = new String[]{"a","b","c"};

        Map<String,Boolean> expected = new HashMap<>();
        expected.put("a",false);
        expected.put("b",false);
        expected.put("c",false);

        assertEquals(expected,mapExercises.wordMultiple(actual));
    }

    @Test
    public void nameToNumberOccurence_2(){
        List<String> actual = Arrays.asList("John","Jack","John");

        assertEquals(2,mapExercises.nameToNumberOccurence(actual,"John"));
    }

    @Test
    public void nameToNumberOccurence_1(){
        List<String> actual = Arrays.asList("John","Jack","John");

        assertEquals(1,mapExercises.nameToNumberOccurence(actual,"Jack"));
    }

    @Test
    public void nameToNumberOccurence_0(){
        List<String> actual = Arrays.asList("John","Jack","John");

        assertEquals(0,mapExercises.nameToNumberOccurence(actual,"Bill"));
    }
}