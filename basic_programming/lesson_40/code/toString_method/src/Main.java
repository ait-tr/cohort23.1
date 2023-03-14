public class Main {

    // Метод toString.
    /*
    Метод toString  является методом класса Object ( класс Object  является в конечном счете
    родительским классом всех обьектов в Джава, суперклассом).
    Метод toString  возвращает строковое представление обьекта и
    при выводе обьекта на печать метод toString неявно  вызывается компилятором Джава,
    но возвращает в большинстве случаев не устраивающее нас представление обьекта.
    Для того, чтобы получить нужное нам представление метод нужно переопределить.
     */
    public static void main(String[] args) {
        Object object = new Object();

        Student jack = new Student(5,"Jack","Berlin");
        Student jill = new Student(1,"Jill","Bonn");

        System.out.println(jack);
        System.out.println(jill);


        /*
5 Jack Berlin
1 Jill Bonn


Student{number=5, name='Jack', city='Berlin'}
Student{number=1, name='Jill', city='Bonn'}
         */
    }


}
