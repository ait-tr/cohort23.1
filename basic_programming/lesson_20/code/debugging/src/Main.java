import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        System.out.println("args now " + Arrays.toString(args));

        String number = "10";
        int num = Integer.parseInt(number);
        System.out.println("String " + (number + 1));
        System.out.println("number " + (num + 1));


        System.out.println("Average finder v0.1");
        double avg = findAverage(args);
        System.out.println("The average is " + avg);


        String[] cars = {"Audi", "BMW", "Ford", "Honda", "Hyundai", "Kia", "Mazda"};
        findCar(cars, "bmw");

    }


    private static double findAverage(String[] input) {
        double result = 0;
        for (String s : input) {
            result += Integer.parseInt(s);
        }
        return result / input.length;
    }

    // Написать метод, который проверяет есть ли заказаная машина в салоне.
    // пример:String [] salon =
    // {"Audi","BMW","Ford","Honda","Hyundai","Kia","Mazda"};
    //название машины для поиска получаем с клавиатуры ( через Scanner)

    //1. создать метод public static  void findCar(String[]cars,String carToFind)
    //2.результат работы метода вывести на экран: carToFind is found  or not found
    //3. Алгоритм работы метода :
    // завести переменную хранящую длину массива
    // в цикле for  сравнивать (через if) каждый элемент массива с машиной, которую ищем
    // если нашли выводим на экран соответствующее уведомление если нет то пишет что такой машины нет.
    //4. Учесть правила сравнения стрингов ( через equals) и учесть возможность использования как больших  так
    // и маленьких букв
    // Arrays.toString(cars)
    //string.equals(string2)
//{"Audi","BMW","Ford","Honda","Hyundai","Kia","Mazda"}
    public static void findCar(String[] cars, String carToFind) {
        int length = cars.length;

        for (int i = 0; i < length; i++) {

            if (cars[i].equalsIgnoreCase(carToFind)) {
                System.out.println("this car is available");
                return;
            }

        }
        System.out.println("this car is not available. Take ");

        for (String car : cars)
            System.out.print(car + " ");


    }


}
