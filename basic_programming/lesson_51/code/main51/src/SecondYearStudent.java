import our_static.Student;

public class SecondYearStudent extends Student {
    public static void main(String[] args) {
        SecondYearStudent student = new SecondYearStudent("Kate",45,"String5");


    }
    public SecondYearStudent(String name, int age, String address) {
        super(name, age, address);
    }

}
