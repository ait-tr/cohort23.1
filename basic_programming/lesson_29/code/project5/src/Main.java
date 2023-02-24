
import java.util.Scanner;

public class Main {
    static Scanner input=new Scanner(System.in);
    public static String currency(){
        System.out.println("Enter the currency you want to convert from (USD, EUR, CHF, JPY, GBP): ");
        String fromCurrency = input.nextLine().toLowerCase();

        return fromCurrency;
    }
    public static double amount() {
        System.out.println("Enter the amount: ");
        double amount=0.0;
        try{
            amount = input.nextDouble();
        }catch (Exception a){
            System.out.println("Enter the amount as a number");
        }

        System.out.println(amount);
        return amount;
    }




    public static void main(String[] args) {

        boolean repeat = true;

        while (repeat) {
            String currency=currency();


            double amount = 0.0;

            amount=amount();


            String toCurrency= getToCurrency(currency, input);

            double exchangeRate = getExchangeRate(currency, toCurrency);

            double result = amount * exchangeRate;
            System.out.println(amount + " " + currency.toUpperCase() + " = " + result + " " + toCurrency.toUpperCase());

            input.nextLine();

            System.out.println("Do you want to convert another currency? (yes or no)");
            String response = input.nextLine();
            if (response.equalsIgnoreCase("no")) {
                repeat = false;
            }
        }

        input.close();
    }

    public static String getToCurrency(String currency, Scanner input) {
        String toCurrency = "";
        switch (currency) {
            case "usd":
                System.out.println("Enter the currency you want to convert to (EUR, GBP, JPY, CHF): ");
                toCurrency = input.next().toLowerCase();
                break;
            case "eur":
                System.out.println("Enter the currency you want to convert to (USD, GBP, JPY, CHF): ");
                toCurrency = input.next().toLowerCase();
                break;
            case "jpy":
                System.out.println("Enter the currency you want to convert to (USD, GBP, EUR, CHF): ");
                toCurrency = input.next().toLowerCase();
                break;
            case "chf":
                System.out.println("Enter the currency you want to convert to (USD, GBP, JPY, EUR): ");
                toCurrency = input.next().toLowerCase();
                break;
            case "gbp":
                System.out.println("Enter the currency you want to convert to (USD, EUR, JPY, CHF): ");
                toCurrency = input.next().toLowerCase();
                break;
            default:
                System.out.println("Invalid currency.");
                break;
        }
        return toCurrency;
    }

    public static double getExchangeRate(String currency, String toCurrency) {
        double exchangeRate = 0.0;
        switch (currency) {
            case "usd":
                switch (toCurrency) {
                    case "eur":
                        exchangeRate = 0.94; // USD to EUR exchange rate
                        break;
                    case "gbp":
                        exchangeRate = 0.83; // USD to GBP exchange rate
                        break;
                    case "jpy":
                        exchangeRate = 134.87; // USD to JPY exchange rate
                        break;
                    case "chf":
                        exchangeRate = 0.93; // USD to CHF exchange rate
                        break;
                    default:
                        System.out.println("Invalid currency.");
                        break;
                }
                break;

            case "jpy":
                switch (toCurrency) {
                    case "usd":
                        exchangeRate = 0.0074; // JPY to USD exchange rate
                        break;
                    case "gbp":
                        exchangeRate = 0.0065; // JPY to GBP exchange rate
                        break;
                    case "eur":
                        exchangeRate = 0.007; // JPY to EUR exchange rate
                        break;
                    case "chf":
                        exchangeRate = 0.0068; // JPY to CHF exchange rate
                        break;
                    default:
                        System.out.println("Invalid currency.");
                        break;
                }
                break;

            case "eur":
                switch (toCurrency) {
                    case "usd":
                        exchangeRate = 1.06; // EUR to USD exchange rate
                        break;
                    case "gbp":
                        exchangeRate = 0.88; // EUR to GBP exchange rate
                        break;
                    case "jpy":
                        exchangeRate = 143.51; // EUR to JPY exchange rate
                        break;
                    case "chf":
                        exchangeRate = 0.99; // EUR to CHF exchange rate
                        break;
                    default:
                        System.out.println("Invalid currency.");
                        break;
                }
                break;

            case "chf":
                switch (toCurrency) {
                    case "usd":
                        exchangeRate = 1.07; // CHF to USD exchange rate
                        break;
                    case "gbp":
                        exchangeRate = 0.94; // CHF to GBP exchange rate
                        break;
                    case "jpy":
                        exchangeRate = 147.32; // CHF to JPY exchange rate
                        break;
                    case "eur":
                        exchangeRate = 1.02; // CHF to EUR exchange rate
                        break;
                    default:
                        System.out.println("Invalid currency.");
                        break;
                }
                break;

            case "gbp":
                switch (toCurrency) {
                    case "usd":
                        exchangeRate = 1.21; // GBP to USD exchange rate
                        break;
                    case "eur":
                        exchangeRate = 1.14; // GBP to EUR exchange rate
                        break;
                    case "jpy":
                        exchangeRate = 154.14; // GBP to JPY exchange rate
                        break;
                    case "chf":
                        exchangeRate = 1.06; // GBP to CHF exchange rate
                        break;
                    default:
                        System.out.println("Invalid currency.");
                        break;
                }
                break;

            default:
                System.out.println("Invalid currency.");
                break;
        }
        return exchangeRate;
    }
}