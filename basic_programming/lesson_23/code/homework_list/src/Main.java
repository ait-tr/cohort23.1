import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> ints = List.of(1,2,3,4,5);
        System.out.println(findSum(ints));

    }
    public static int findSum(List<Integer>ints){
        int sum = 0;

        for(int index: ints){
            sum = sum+index;
        }

        return sum;
    }
}