public class Subclass extends Superclass{
    int a = 150;

    void printA(){
        System.out.println(a);
    }
    void printSuperA(){
        System.out.println(super.a);
    }

    void showMethodClass(){
        System.out.println("Child class method");
    }

    void printMethodClass(){
        //вызывает метод переопределяющий
        showMethodClass();
        // вызывает переопределнный из родительского класса
        super.showMethodClass();
    }
}
