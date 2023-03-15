public class Main {

    // Super keyword
    /*
     слово super  ссылается на обьекты родительского класса

     Слово super используется в следующих случаях:
     1.Для получения доступа к членам класса когда оба родительский
      и дочерний классы имеют переменные/методы с одинаковым названием
     2. Для вызова в явном виде конструктора родительского класса
     3. для получения доступа к методу родительского класса если он
     переопределен в подклассе.
     */
    public static void main(String[] args) {


        Subclass s = new Subclass();
        s.printA();
        s.printSuperA();

        s.printMethodClass();
    }
    /*
    150
100
     */

    /*
Child class method
Parent class method
     */
}
