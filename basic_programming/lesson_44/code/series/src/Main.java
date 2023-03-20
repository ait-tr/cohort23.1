import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Twos two = new Twos();
        Series two1 = new Twos();
       // two.
       // two1.

        for(int i=0;i<5;i++){
            System.out.println("Next value is "+two1.getNext());
        }
        System.out.println("\nResetting");
        two1.reset();
        for(int i=0;i<5;i++){
            System.out.println("Next value is "+two1.getNext());
        }

        System.out.println("\nStarting at 100");
        two1.setStart(100);
        for(int i=0;i<5;i++){
            System.out.println("Next value is "+two1.getNext());
        }
        Twos twos = new Twos();
        Threes threes = new Threes();
        Series series;

        series = twos;
        series = threes;
        Series series1 = new Twos();
        Series series2 = new Threes();


        List  list = new ArrayList<>();
        List list1 = new LinkedList();
        LinkedList linkedList = new LinkedList();
      //  linkedList.

    }

    /*
    Next value is 2
Next value is 4
Next value is 6
Next value is 8
Next value is 10

Resetting
Next value is 2
Next value is 4
Next value is 6
Next value is 8
Next value is 10

Starting at 100
Next value is 102
Next value is 104
Next value is 106
Next value is 108
Next value is 110
     */
}
