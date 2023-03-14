public class Student {

    int number;
    String name;

    // создается связь HAS-A  с классом Address
    Address address;

    public Student ( int number,String name,Address address){
        this.number = number;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
