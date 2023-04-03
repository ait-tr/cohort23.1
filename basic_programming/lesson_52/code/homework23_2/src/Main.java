import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Main m = new Main();
        garbageSorter();
        printDigits(5329);
    }

    /*
    Задача 2. Задача на условие, switch case Создать "Бот-помощник", коорый
    помогает сортировать мусор. На входе -
    наименование выбрасываемого мусора, на выходе сообщение, в какого цвета урну
    нужно отправить этот мусор. Если выбрасывается стекло (бутылки, банки и т.д.), то бот должен запросить цвет и указать, куда выбросить цветное стекло.
    */
    public static void garbageSorter() {
        Scanner scanner = new Scanner(System.in);

        String garbageSort;

        do {
            System.out.println("What kind of garbage do you want to throw away?");//какой мусор вы хотите выбросить?
            garbageSort = scanner.nextLine().toUpperCase();

            switch (garbageSort) {

                case "PAPER"://бумага
                    System.out.println("Throw to white container");// выбросить в белый контейнер
                    break;
                case "FOOD": // пищевые отходы
                    System.out.println("Throw to red container");//  выбросить в красный контейнер
                    break;

                case "GLASS":// стекло
                    System.out.println("Indicate the colour - WHITE, GREEN or BROWN");// укажите цвет белый,зеленый,
                    // коричневый
                    String glassColour = scanner.nextLine();
                    if (glassColour.equalsIgnoreCase("WHITE")) {
                        System.out.println("Throw to white glass compartment");// выбросить в  отделение для белого
                    } else if (glassColour.equalsIgnoreCase("GREEN")) {
                        System.out.println("Throw to green glass compartment");// выбросить в отделение для зеленого
                    } else {
                        System.out.println("Throw to brown glass compartment");// выбросить в отделение для коричневого
                    }

                    break;

                default:
                    System.out.println("This sort of garbage does not exist");//мусор такого сорта не существует

            }
            System.out.println("Do you want to throw away more garbage? Enter any letter if yes and 'no' if not");
            //хотите выбросить еще мусор ? введите любую букву если да и no  если нет

        } while (!(scanner.nextLine().toUpperCase().equals("NO")));

    }

/*Задача 3 (*). Цикл while // Вводится натуральное число.
Напечатать, из каких цифр оно состоит. // Пример: // 5329 - это число // 5 // 3 // 2 // 9 // -
это цифры, из которого состоит число
5329 % 10 = 9
5329/10 = 532
532%10 = 2
532/10 =53
53%10 = 3
     */

    public static void printDigits(int n) {
        List<Integer> numbers = new ArrayList<>();

        while (n > 0) {
            System.out.println(n % 10);

            numbers.add(n % 10);
            n = n / 10;
        }
        Collections.reverse(numbers);
        System.out.println(numbers);
    }
}
