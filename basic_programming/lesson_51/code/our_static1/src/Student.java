public class Student {
    protected String name;
    int age;
    String address;

  private static int counter;

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public  int ageIncrease(){
        return ++age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", counter='" + counter + '\'' +
                '}';
    }
}
