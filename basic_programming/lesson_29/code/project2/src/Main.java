import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to convert? 'yes' to proceed");
        while (input.next().equals("yes")) {
            convert();
            System.out.println("Do you want to convert? 'yes' to proceed");
        }
    }

    public static void convert() {
        double userMoneyAmount = enterAmountScanner();
        // 1 - 12
        int choice = enterChoice();
        currencyConvertor(userMoneyAmount, choice);
    }

    public static double enterAmountScanner() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Please, enter a positive number");
            String valueString = input.next();
            try {
                double value = Double.parseDouble(valueString);
                if (value > 0) {
                    return value;
                }
                System.out.println("The entered value must be positive");
            } catch (NumberFormatException e) {
                System.out.println("The entered value looks like not a number");
            }
        }
    }


    public static int enterChoice() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 to convert USD to EUR: ");
            System.out.println("Enter 2 to convert USD to GBP: ");
            System.out.println("Enter 3 to convert USD to RUB: ");
            System.out.println("Enter 4 to convert EUR to USD: ");
            System.out.println("Enter 5 to convert EUR to GBD: ");
            System.out.println("Enter 6 to convert EUR to RUB: ");
            System.out.println("Enter 7 to convert RUB to USD: ");
            System.out.println("Enter 8 to convert RUB to GBP: ");
            System.out.println("Enter 9 to convert RUB to EUR: ");
            System.out.println("Enter 10 to convert GBP to EUR: ");
            System.out.println("Enter 11 to convert GBP to USD: ");
            System.out.println("Enter 12 to convert GBP to RUB: ");
            String choiceString = input.next();
            try {
                int choice = Integer.parseInt(choiceString);
                if (choice <= 12 && choice > 0) {
                    return choice;
                }
                System.out.println("Error enter. Enter only from 1 to 12!");
            } catch (Exception e) {
                System.out.println("Error enter. Enter only from 1 to 12!");
            }
        }
    }

    public static void currencyConvertor(double userMoneyAmount, int choice) {
        switch (choice) {

            case 1:
                double result = userMoneyAmount * 0.7;
                System.out.println("You receive");
                System.out.println(result + " EUR");
                break;
            case 2:
                result = userMoneyAmount * 0.6;
                System.out.println("You receive");
                System.out.println(result + " GBP");
                break;
            case 3:
                result = userMoneyAmount * 66.68;
                System.out.println("You receive");
                System.out.println(result + " RUB");
                break;
            case 4:
                result = userMoneyAmount * 1.12;
                System.out.println("You receive");
                System.out.println(result + " USD");
                break;
            case 5:
                result = userMoneyAmount * 2.12;
                System.out.println("You receive");
                System.out.println(result + " GBP");
                break;
            case 6:
                result = userMoneyAmount * 0.023;
                System.out.println("You receive");
                System.out.println(result + " RUB");
            case 7:
                result = userMoneyAmount * 0.03;
                System.out.println("You receive");
                System.out.println(result + " USD");
                break;
            case 8:
                result = userMoneyAmount * 0.004;
                System.out.println("You receive");
                System.out.println(result + " GBP");
                break;
            case 9:
                result = userMoneyAmount * 1.11;
                System.out.println("You receive");
                System.out.println(result + " EUR");
                break;
            case 10:
                result = userMoneyAmount * 1.59;
                System.out.println("You receive");
                System.out.println(result + " EUR");
                break;
            case 11:
                result = userMoneyAmount * 1.009;
                System.out.println("You receive");
                System.out.println(result + " USD");
                break;
            case 12:
                result = userMoneyAmount * 100;
                System.out.println("You receive");
                System.out.println(result + " RUB");
                break;

            default:
                System.out.println("Please enter correct operation from 1 to 12");
                break;
        }
    }

}