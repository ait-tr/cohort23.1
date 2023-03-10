public class Main {

    /*
    Наследование.
    Наследование в Джава это механизм организации и переиспользования при котором
    подкласс наследует свойства и методы родительского класса

    Родительский класс также может называться базовым классом или суперклассом по отношению к дочернему классу
    (base class or super class
    Дочерний класс также может называться подклассом ( sub class or child class)

    указанием на то, что класс является дочерним является слово extends , за которым следует название
    родительского класса.

    Такой вид связи называется "IS-A"  JavaTeacher IS A teacher


     */
    public static void main(String[] args) {


        Boy jack = new Boy();
        jack.height = 140;

        System.out.println(jack.getHeight());

        //проверить принадлежность обьекта к калссу или родительскому классу можно с помощью
        // метода instanceof, который возвращает true  если да.

        System.out.println(jack instanceof Person);

        Person person = new Person();

        System.out.println(person instanceof Boy);

        // Виды наследования в Джава
        /*
        1 Single inheritance-  одиночное.

        class A{}

        class B extends A {}


        2. Multilevel Inheritance - многоуровневое
        class A{}

        class B extends A {}

        class C extends B {}

        3. Hierarchical Inheritance -  иерархическое

        class A{}

        class B extends A {}

        class C extends A {}

        class D extends A {}


        4- Hybrid -  гибридное

        class A{}

        class B extends A {}

        class C extends A {}

        class D extends С {}



   Один дочерний класс не может иметь несколько  родительских классов. Java does not support
   multiple inheritance


    Модификаторы доступа:
   Public -  видны везде в программе
   Private -  видны только в своем классе
   Default -  видны только в пакете, в котором находится данный класс
   Protected -   видны в пакете, в котором находится данный класс любым классам а также
                 видны классам наследникам, находящимся в других пакетах


   Дочерний класс может наследовать только те переменные и методы родительского класса, которые
   являются public or protected. К Private  членам класса  можно получить доступ через использование
   в родительском классе public or protected  геттеров и  сеттеров


   Использование конструктора при наследовании

   При создании обьекта дочернего класса вызывается конструктор этого класса,
   но в нем по умолчанию вначале вызывается конструктор родительского класса

   Если в родительском классе существует конструктор с параметрами, мы можем вызвать из дочернего класса
    конструктор родительского класса  через слово super c соответствующими параметрами в скобках

    Нужно иметь в виду, что вызов родительского конструктора должен быть первым в дочернем super()

         */


    }
}
