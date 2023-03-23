/**
 * Создать класс Employee c полями id, name, age, salary.
 * Сделать его Comparable по id
 * Создать дополнительные возможности сортировки по: salary, age, name
 * а также по ageAndThenName, т.е. если возраст одинаковый, то
 * сортировать по имени.
 * Создать в классе Main список сотрудников и отсортировать его всеми
 * этими способами
 */


public class Employee implements Comparable<Employee>{
    private  int id;
    private String name;
    private int age;
    private int salary;

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "[id=" + id +", name='" + name  + ", age=" + age + ", salary=" + salary +']';
    }

    public int compareTo(Employee emp){
        return this.id -emp.id;
    }
}
