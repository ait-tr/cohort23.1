import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListTasksTest {

    private ListTasks listTasks;

    @BeforeEach
    public void init(){
        listTasks = new ListTasks();
    }
    @Test
    public void removeNamesLength4_test_fourIn_twoOut(){
        List<String> actual = Arrays.asList("John", "Pablo", "Ann", "Jack");
        List<String> expected = Arrays.asList("Pablo", "Ann");

        assertEquals(expected,listTasks.removeNamesLength4(actual));
    }
    @Test
    public void removeNames_test_empty(){
        assertEquals(Arrays.asList(),listTasks.removeNamesLength4(Arrays.asList()));
    }


    @Test
    public void removeNames_test_noNamesLength4(){
        List<String> actual = Arrays.asList("Johnn", "Pablo", "Ann", "Jackk");
        List<String> expected = Arrays.asList("Johnn", "Pablo", "Ann", "Jackk");

        assertEquals(expected,listTasks.removeNamesLength4(actual));
    }


    @Test
    public void when_allNamesLength4_then_returnEmptyList(){
        List<String> actual = Arrays.asList("John", "Pabl", "Annn", "Jack");
        List<String> expected = Arrays.asList();

        assertEquals(expected,listTasks.removeNamesLength4(actual));
    }



}