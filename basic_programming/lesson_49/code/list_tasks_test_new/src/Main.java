import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListTasks listTasks = new ListTasks();

        List<String> actual = Arrays.asList("John", "Pablo", "Ann", "Jack");



        System.out.println(listTasks.removeNamesLength4(actual));

    }
}
