import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(10,"Boris",75,10000),
                new Employee(20,"Dmitry",29,20000),
                new Employee(5,"Anna",45,5000),
                new Employee(1,"Semen",75,50000),
                new Employee(3,"C1",32,50000)
        );

        Collections.sort(employees);
        System.out.println("by id");
        System.out.println(employees);


        System.out.println("by salary");
        Collections.sort(employees,new SalaryComparator());
        System.out.println(employees);

        System.out.println("by age");
        Collections.sort(employees,new AgeComparator());
        System.out.println(employees);

        System.out.println("by name");
        Collections.sort(employees,new NameComparator());
        System.out.println(employees);

        System.out.println("by age and then name");
        Collections.sort(employees,new AgeAndNameComparator());
        System.out.println(employees);
    }

    /*
    by id
[[id=1, name='Semen, age=75, salary=50000], [id=3, name='C1, age=32, salary=50000], [id=5, name='Anna, age=45, salary=5000], [id=10, name='Boris, age=75, salary=10000], [id=20, name='Dmitry, age=29, salary=20000]]
by salary
[[id=5, name='Anna, age=45, salary=5000], [id=10, name='Boris, age=75, salary=10000], [id=20, name='Dmitry, age=29, salary=20000], [id=1, name='Semen, age=75, salary=50000], [id=3, name='C1, age=32, salary=50000]]
by age
[[id=20, name='Dmitry, age=29, salary=20000], [id=3, name='C1, age=32, salary=50000], [id=5, name='Anna, age=45, salary=5000], [id=10, name='Boris, age=75, salary=10000], [id=1, name='Semen, age=75, salary=50000]]
by name
[[id=5, name='Anna, age=45, salary=5000], [id=10, name='Boris, age=75, salary=10000], [id=3, name='C1, age=32, salary=50000], [id=20, name='Dmitry, age=29, salary=20000], [id=1, name='Semen, age=75, salary=50000]]
by age and then name
[[id=20, name='Dmitry, age=29, salary=20000], [id=3, name='C1, age=32, salary=50000], [id=5, name='Anna, age=45, salary=5000], [id=10, name='Boris, age=75, salary=10000], [id=1, name='Semen, age=75, salary=50000]]


     */
}
