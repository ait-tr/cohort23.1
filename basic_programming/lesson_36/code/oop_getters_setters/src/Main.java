public class Main {

    public static void main(String[] args) {
        Person bill = new Person("Bill",40,80,180);
        System.out.println(bill.getName()+"'s parameters are:");
        System.out.println("age:"+bill.getAge());
        System.out.println("weight:"+bill.getWeight());
        System.out.println("height:"+bill.getHeight());
        System.out.println();

        Person john = new Person("John",30,70,175);
        System.out.println(john.getName()+"'s parameters are:");
        System.out.println("age:"+john.getAge());
        System.out.println("weight:"+john.getWeight());
        System.out.println("height:"+john.getHeight());
    /*
    Bill's parameters are:
age:40
weight:80
height:180

John's parameters are:
age:30
weight:70
height:175
     */

        john.setAge(-100);
        john.setHeight(0);
        john.setWeight(0);
        System.out.println(john.getName()+"'s parameters are:");
        System.out.println("age:"+john.getAge());
        System.out.println("weight:"+john.getWeight());
        System.out.println("height:"+john.getHeight());

        /*
        John's parameters are:
age:-100
weight:0
height:0
         */

        john.setAge(45);
        john.setWeight(70);
        john.setHeight(175);

        System.out.println(john.getName()+"'s parameters are:");
        System.out.println("age:"+john.getAge());
        System.out.println("weight:"+john.getWeight());
        System.out.println("height:"+john.getHeight());

        /*
        John's parameters are:
age:45
weight:70
height:175

         */
        john.setAge(-10);
        john.setHeight(3);
        john.setWeight(1);

        System.out.println(john.getName()+"'s parameters are:");
        System.out.println("age:"+john.getAge());
        System.out.println("weight:"+john.getWeight());
        System.out.println("height:"+john.getHeight());


        Person nick = new Person();
        System.out.println(nick.getName()+"'s parameters are:");
        System.out.println("age:"+nick.getAge());
        System.out.println("weight:"+nick.getWeight());
        System.out.println("height:"+nick.getHeight());

        Employee employee = new Employee("Andrew",1200);
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        employee.setSalary(2400);
        employee.setSalary(0);
        System.out.println(employee.getSalary());

        john.move();
        john.askName();




    }

    //Getters and setters.  Геттеры и сеттеры

    /*
    Геттеры и сеттеры это методы, которые используются для защиты данных.

    Геттер возвращает значение поля. Название геттера начинается со слова get за
    которым следует имя переменной , значение которой он возвращает.

    Сеттер присваивает переменной новое значение. Сеттер начинается со слова set, за
    которым следует название переменной, значение которой он меняет.

     */
}
