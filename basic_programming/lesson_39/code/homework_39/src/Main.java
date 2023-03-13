public class Main {
    public static void main(String[] args) {
        int[]array = {4,1,7,1};

        MaxInArray max = new MaxInArray(array);
        System.out.println(max.findMax());

        Employee employee1 = new Employee("Employee1",1000,8);
        Employee employee2 = new Employee("Employee2",490,5);
        Employee employee3 = new Employee("Employee3",2000,5);
        Employee employee4 = new Employee("Employee4",400,10);

        /*
1005
500
2000
415
         */

        employee1.addSalary();
        employee1.addForWork();
        employee2.addSalary();
        employee2.addForWork();
        employee3.addSalary();
        employee3.addForWork();
        employee4.addSalary();
        employee4.addForWork();

        System.out.println(employee1.salary);
        System.out.println(employee2.salary);
        System.out.println(employee3.salary);
        System.out.println(employee4.salary);
    }


}
