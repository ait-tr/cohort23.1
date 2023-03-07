public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary) {
        if(salary>0){
        this.salary = salary;
        }else{
            System.out.println("Salary must be positive");
        }
    }

}
