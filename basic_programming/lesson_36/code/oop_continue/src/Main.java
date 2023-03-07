public class Main {

    // Типы конструкторов
    //1. Default Constructor  дефолтный конструктор. Конструктор по умолчанию,
    // вставляется в код компилятором в процессе компиляции
    //2. no-args constructor - конструктор без аргументов.public Person(){}
    // parameterized constructor - конструктор с аргументами

    //Поля класса инициализируются по умолчанию. Обьекты инициализируются null,
    // а примитивные типы каждый значениями своего типа , в частности int нулем,
    // boolean  false  и т.д.
    Person person = new Person("John", 23);
    Person personVoid = new Person();

    public static void main(String[] args) {
        Person personVoid = new Person();
        System.out.println("Person's name is " + personVoid.name);
        System.out.println("Person's age is " + personVoid.age);
        System.out.println("Person's is present is " + personVoid.isPresent);


        Person john = new Person("John", 23);
        john.move();

        Person bill = new Person("Bill", 60);


        john.askName();

        /*
What is your name?
My name is John
         */

        bill.askName();
        // What is your name?
        // My name is Bill

        System.out.println(john.letter);

        john.age = -34;
        System.out.println("John's age " + john.age);
        john.height = 0;
        john.weight = -12346;


    }

}
