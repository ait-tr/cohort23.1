public class Student {
    int number;
    String name;
    String city;

    public Student(int number, String name, String city){
        this.number = number;
        this.name = name;
        this.city = city;
    }

  /*  public String toString(){
        return number +" "+name+" "+city;
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
