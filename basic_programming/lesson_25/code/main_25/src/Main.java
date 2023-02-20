import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer>ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);

        //   for(int i =0;i<ints.size();i++){
        for(int i =0;i<5;i++){
            ints.add(i);
        }
        System.out.println(ints);
    }
}
