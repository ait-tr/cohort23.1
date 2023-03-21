import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    //Интерфейс Comparable. Интерфейс Comparable  используется  для сравнения  однотипных обьектов  и
    // позволяет сортировать обьекты в соответствии с определенным порядком. Если сравнение и сортировка
    // например числовых массивов понятна , так как на числах задан естественный порядок , то с обьектами
   // нужно определять порядок самостоятельно.
    // Для этой цели служит интерфейс Comparable и его метод compareTo()
   // int compareTo(Object o1)
    /*
        Этот метод сравнивает обьект, в котором он реализован со вторым обьектом. Результатом его работы
        является целое число, которое означает следуюшее:
        -если оно больше нуля, то обьект, на котором метод вызывается  больше второго обьекта о1
        -если оно равно нулю, то обьекты равны
        - если меньше нуля то обьект меньше чем о1

        В методе сравнение происходит по отдельным полям. Т.е. нужно принять решение какое/какие поля
         этого класса будут участвовать в определении естественного порядка сортировки обьектов класса.
     */

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Grapes");
        fruits.add("Guava");



        System.out.println("Fruit before sorting:");
        System.out.println(fruits);

        System.out.println("Fruit after sorting:");
        Collections.sort(fruits);
        System.out.println(fruits);

        /*
        Fruit before sorting:
[Orange, Banana, Apple, Grapes, Guava]
Fruit after sorting:
[Apple, Banana, Grapes, Guava, Orange]
         */

        List<Player> team = new ArrayList<>();
        Player player1 = new Player(3,"John",20);
        Player player2 = new Player(1,"Steve",19);
        Player player3 = new Player(2,"Alexander",24);

        team.add(player1);
        team.add(player2);
        team.add(player3);

        System.out.println("Football team before sorting");
        System.out.println(team);
        System.out.println("Football team after sorting");
        Collections.sort(team);
        System.out.println(team);

/*
[Player{ranking=3, name='John', age=20}, Player{ranking=1, name='Steve', age=19}, Player{ranking=2, name='Alexander', age=24}]
Football team after sorting
[Player{ranking=1, name='Steve', age=19}, Player{ranking=2, name='Alexander', age=24}, Player{ranking=3, name='John', age=20}]

 */

        String str = new String();
      //  str.compareTo()



    }

}
