public class Employee {

    /*
    Создать класс Employee , содержащий следующие поля и методы:

поле имя,
поле зарплата,
поле количество рабочих часов в день,
конструктор
метод addSalary(), добавляющий 10 евро к зарплате если зарплата сотрудника меньше 500
метод addForWork(), добавляющий 5 евро к зарплате сотрудника если количество рабочих часов в день больше 6.
Создать несколько экземпляров класса с различными параметрами и вывести на экран результат работы методов
     */
    String name;
    int salary;
    int numberOfHours;

    public Employee(String name, int salary, int numberOfHours){
        this.name = name;
        this.salary = salary;
        this.numberOfHours = numberOfHours;
    }

    public void addSalary(){
        if(salary<500)
            salary = salary+10;
    }

    public void addForWork(){
        if(numberOfHours>6)
            salary = salary+5;
    }
}
