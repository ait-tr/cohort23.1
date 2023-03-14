public class Main {
    // Has-A relationship
    public static void main(String[] args) {
        Address address1 = new Address("Berlin",
                                    "Germany",
                                     "Str1",
                                34);
        Address address2 = new Address("Bonn",
                "Germany",
                "Str2",
                67);

        Student jack = new Student(1,"Jack",address1);
        Student jill = new Student(3,"Jill",address2);

        System.out.println(jack);
        System.out.println(jill);
      //  jack.
    }

    /*
Student{number=1, name='Jack', address=city='Berlin, country='Germany, street='Str1, houseNumber=34}
Student{number=3, name='Jill', address=city='Bonn, country='Germany, street='Str2, houseNumber=67}
     */


}
