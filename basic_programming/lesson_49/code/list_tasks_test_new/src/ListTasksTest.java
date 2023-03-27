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

    @Test
    public void yesNo_test_empty(){
        assertEquals(Arrays.asList(),listTasks.compareYesNo(Arrays.asList(),Arrays.asList()));
    }


    @Test
    public void yesNo_test_oneElt(){
        List<String>expected = Arrays.asList("No");

        List<Integer> actual1 = Arrays.asList(1);
        List<Integer> actual2 = Arrays.asList(5);
        assertEquals(expected,listTasks.compareYesNo(actual1,actual2));
    }

    @Test
    public void yesNo_test_several(){
        List<String>expected = Arrays.asList("No","Yes","Yes","No");

        List<Integer> actual1 = Arrays.asList(1,2,3,4);
        List<Integer> actual2 = Arrays.asList(5,2,3,8);

        assertEquals(expected,listTasks.compareYesNo(actual1,actual2));
    }

 //   @Test
    // test with '==' in method yesNo
    public void yesNo_test_border(){
        List<String>expected = Arrays.asList("Yes","No");

        List<Integer> actual1 = Arrays.asList(127,128);
        List<Integer> actual2 = Arrays.asList(127,128);

        assertEquals(expected,listTasks.compareYesNo(actual1,actual2));
    }


    @Test
    public void yesNo_test_big(){
        List<String>expected = Arrays.asList("Yes","No");

        List<Integer> actual1 = Arrays.asList(199_999_999,399_999_999);
        List<Integer> actual2 = Arrays.asList(199_999_999,399_999_998);

        assertEquals(expected,listTasks.compareYesNo(actual1,actual2));
    }

    @Test
    public void reverse_test_empty(){
        assertEquals(Arrays.asList(),listTasks.reversed(Arrays.asList()));
    }


    @Test
    public void reverse_test_one(){
        assertEquals(Arrays.asList(1),listTasks.reversed(Arrays.asList(1)));
    }

    @Test
    public void reverse_test_several(){
        List<Integer> expected = Arrays.asList(1,3,2,4,5);
        List<Integer> actual = Arrays.asList(5,4,2,3,1);

        assertEquals(expected,listTasks.reversed(actual));
    }

    @Test
    public void getAddresses_test_one(){
        Address address = new Address("Street1",1);
        Person person = new Person("Person1",address);
        List<Address> expected = Arrays.asList(address);
        List<Person> actual = Arrays.asList(person);

        assertEquals(expected,listTasks.getAddresses(actual));

    }

    @Test
    public void getAddresses_test_several(){
        Address address1 = new Address("Street1",1);
        Address address2 = new Address("Street2",2);
        Person person1 = new Person("Person1",address1);
        Person person2 = new Person("Person2",address2);
        List<Address> expected = Arrays.asList(address1,address2);
        List<Person> actual = Arrays.asList(person1,person2);

        assertEquals(expected,listTasks.getAddresses(actual));

    }



}