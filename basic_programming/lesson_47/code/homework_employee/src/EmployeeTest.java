import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    Employee john;
    Employee ann;

   @BeforeEach
    void init(){
        john = new Employee(20,"John",29,20000);
        ann =  new Employee(5,"Ann",45,5000);
    }

    @Test
    void testCompareTo(){
        Assertions.assertTrue(john.compareTo(ann)>0);
    }

    @Test
    void testComparatorAge(){
       AgeComparator ac = new AgeComparator();

       Assertions.assertTrue(ac.compare(john,ann)<0);
    }

    @Test
    void testComparatorName(){
        NameComparator nc = new NameComparator();

        Assertions.assertTrue(nc.compare(john,ann)>0);
    }

    @Test
    void testComparatorSalary(){
        SalaryComparator sc = new SalaryComparator();

        Assertions.assertTrue(sc.compare(john,ann)>0);
    }


    @Test
    void testComparatorAgeName(){

        Assertions.assertTrue(new AgeAndNameComparator().compare(john,ann)<0);
    }


}
