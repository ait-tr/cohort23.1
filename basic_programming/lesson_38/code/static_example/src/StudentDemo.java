public class StudentDemo {

    public static void main(String[] args) {


        Student john = new Student("John", "Berlin, FridrichStr 1");
        Student bill = new Student("Bill", "Berlin, Straße 3");

        System.out.println("name is: "+john.name);
        System.out.println("address is: "+john.address);
        System.out.println();
        System.out.println("name is: "+bill.name);
        System.out.println("address is: "+bill.address);

        System.out.println("number of students is: "+Student.numberOfStudents);

        Student mary = new Student("Mary", "Berlin, Straße 3");

        System.out.println();
        System.out.println("name is: "+mary.name);
        System.out.println("address is: "+mary.address);

        System.out.println("number of students now is: "+Student.numberOfStudents);

/*
name is: John
address is: Berlin, FridrichStr 1

name is: Bill
address is: Berlin, Straße 3
number of students is: 2

name is: Mary
address is: Berlin, Straße 3
number of students now is: 3
 */
    }

}
