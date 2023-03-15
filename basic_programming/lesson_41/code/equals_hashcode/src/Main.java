public class Main {

    //Методы Equals  и Hashcode
    public static void main(String[] args) {
        Order o1 = new Order (1,"order1");
        Order o2 = new Order(1,"order1");
        Order o3 = new Order(2,"order1");


        //Equals
        // метод equals является методом класса Object и сравнивает обьекты по их адресам
        // Для корректного сравнения метод equals  должен быть переопределен.
        System.out.println("equals via == "+(o1==o2));
        System.out.println("equals via overrided equals "+o1.equals(o2));
        System.out.println("o1 equals o3 "+o1.equals(o3));

        /*
equals via == false
equals via overrided equals true
         */

        Object object = new Object();
       // object.


        //Условия, которым должен отвечать метод equals() ("контракт")
       /*
        1.reflexive:   Обьект должен быть равен себе.  x.equals(x)
        2.symmetric:    x.equals(y) возвращает тот же результат что и   y.equals(х)
        3.transitive:   если x.equals(y) and y.equals(z) то x.equals(z)
        4.consistent:   значение equals  может меняться только если меняется какая-то из составлящих, содержащаяся в equals


        если x==y  то  y==x
        x=2
        y=2

        z=2

        x=y=2
        y=z=2

        x=z


        */

        //hashCode() Method
        Object ob = new Object();
        System.out.println(ob.hashCode());

        /*
        hashcode - это просто целое число и он есть   у каждого обьекта в Джава. Чтобы получить его значение
        можно использовать метод hashcode().
        Т.к. этот метод является методом класса Object то он наследуется всеми классами в Джава.
        метод hashcode() должен возвращать одно и тоже значение хеш для двух обьектов, которые равны в соответствии
        с методом equals()

        правила для метода hashcode() ("контракт")
        1.internal consistency значение хешкода может меняться только если значения в equals  меняются
        2.equals consistency  равные обьекты имеют одинаковые хешкоды
        3.collisuons  не равные обьекты могут иметь одинакове хешкоды
         */
    }


}
