public class Student {
    String name;
    String address;

    static int numberOfStudents;

    public Student(String name, String address){
        this.name = name;
        this.address = address;
        numberOfStudents++;
    }
}
