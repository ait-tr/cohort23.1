
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    // курсы валют
    static double usdRate = 1.0;
    static double eurRate = 0.82;
    static double gbpRate = 0.72;
    static double rubRate = 73.5;
    public static void main(String[] args) {
        boolean start = true;
        while (start) {
            String result = convert();
            if (result.equals("Q")) {
                System.out.println("Досвидания ;)");
                start = false;
            } else {
                System.out.println("Ваши деньги : " + result);
                scanner.nextLine();
            }
        }
    }

    public static String convert() {

        // ввод с клавиатуры
        System.out.print("Введите Вашу валюту USD, EUR, GBP,RUB (или 'q' для выхода): ");
        String currency = scanner.nextLine().toUpperCase();

        if (currency.equals("Q")) {
            return "Q";
        }
        System.out.print("Введите валюту, на какую нужно поменять USD, EUR,GBP, RUB: ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Сколько " + currency + " поменять на " + targetCurrency + " : ");
        double amount = scanner.nextDouble();
        // конвертация
        double convertedAmount = 0.0;
        switch (currency) {
            case "USD":
                convertedAmount = amount / usdRate;
                break;
            case "EUR":
                convertedAmount = amount / eurRate;
                break;
            case "GBP":
                convertedAmount = amount / gbpRate;
                break;
            case "RUB":
                convertedAmount = amount / rubRate;
                break;
            default:
                System.out.println("Неверная валюта");
                break;
        }
        // Передаю данные дальше
        return convertNext(convertedAmount, targetCurrency);
    }

    public static String convertNext(double convertedAmount, String targetCurrency) {

        switch (targetCurrency) {
            case "USD":
                convertedAmount *= usdRate;
                break;
            case "EUR":
                convertedAmount *= eurRate;
                break;
            case "GBP":
                convertedAmount *= gbpRate;
                break;
            case "RUB":
                convertedAmount *= rubRate;
                break;
            default:
                System.out.println("Неверная валюта");
                break;
        }
        String string = String.format("%.2f", convertedAmount);
        return string + " " + targetCurrency;
    }
}






