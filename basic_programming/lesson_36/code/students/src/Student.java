public class Student {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "John";
        student.number = 10;

        Student student1 = new Student("Jack",2);


    }
    String name;
    int number;

    public Student(){}

    public Student(String name, int number){
        this.name = name;
        this.number = number;
    }


}
