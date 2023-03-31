import static our_static.Student.getCounter;

public class Main {

    public static void main(String[] args) {


        Student john = new Student("John",24,"Street1");
        System.out.println(john);
        Student jack = new Student("Jack",41,"Street2");
        System.out.println(jack);


        System.out.println("counter = "+getCounter());
        System.out.println("John's age is"+john.ageIncrease());
        System.out.println("Jack's age is"+jack.ageIncrease());





       // System.out.println(john);

    }
}
