
import java.util.*;

public class Main {
    public static void main(String[] args) {

        currencyConverter();

    }

    public static void currencyConverter(){
        String fromCurrensy = strFromCurrensy (); // scanner - какую валюту меняем
        double amount = doubleAmount();  // scanner - сколько меняем
        String toCurrency = strToCurrency();  // scanner - на какую валюту меняем
        double rate = rate(fromCurrensy,toCurrency);  // определяет курс
        printTheResult(amount, rate, fromCurrensy, toCurrency);  // считает и печатает результат в виде:   x USD = y EURO
    }
    public static String strFromCurrensy (){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the currency you want to convert from (USD, EURO, GBP, JPY, CHF): ");
        String fromCurrency = input.nextLine();

        return fromCurrency;
    }

    public static double doubleAmount (){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        double amount = input.nextDouble();

        return amount;
    }

    public static String strToCurrency (){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the currency you want to convert to (USD, EURO, GBP, JPY, CHF): ");
        String toCurrency = input.next();

        return toCurrency;
    }

    public static double rate (String from, String to){

        Map<String,Double> exchangeRatesForUSD = new HashMap<>();{
            exchangeRatesForUSD.put("EURO", 0.94);
            exchangeRatesForUSD.put("GBP", 0.83);
            exchangeRatesForUSD.put("JPY", 134.94);
            exchangeRatesForUSD.put("CHF", 0.93);
        }
        Map<String,Double> exchangeRatesForEURO = new HashMap<>();{
            exchangeRatesForEURO.put("USD", 1.06);
            exchangeRatesForEURO.put("GBP", 0.88);
            exchangeRatesForEURO.put("JPY", 143.16);
            exchangeRatesForEURO.put("CHF", 0.99);
        }
        Map<String,Double> exchangeRatesForGBP = new HashMap<>();{
            exchangeRatesForGBP.put("USD", 1.21);
            exchangeRatesForGBP.put("EURO", 1.14);
            exchangeRatesForGBP.put("JPY", 162.63);
            exchangeRatesForGBP.put("CHF", 1.12);
        }
        Map<String,Double> exchangeRatesForJPY = new HashMap<>();{
            exchangeRatesForJPY.put("USD", 0.0074);
            exchangeRatesForJPY.put("EURO", 0.0070);
            exchangeRatesForJPY.put("GBP", 0.0061);
            exchangeRatesForJPY.put("CHF", 0.0069);
        }
        Map<String,Double> exchangeRatesForCHF = new HashMap<>();{
            exchangeRatesForCHF.put("USD", 1.07);
            exchangeRatesForCHF.put("EURO", 1.01);
            exchangeRatesForCHF.put("GBP", 0.89);
            exchangeRatesForCHF.put("JPY", 144.96);
        }
        double rate=0;
        if(from.equalsIgnoreCase("USD")) rate=exchangeRatesForUSD.getOrDefault(to,1.0);
        else if(from.equalsIgnoreCase("EURO")) rate=exchangeRatesForEURO.getOrDefault(to,1.0);
        else if(from.equalsIgnoreCase("GBP")) rate=exchangeRatesForGBP.getOrDefault(to,1.0);
        else if(from.equalsIgnoreCase("JPY")) rate=exchangeRatesForJPY.getOrDefault(to,1.0);
        else if(from.equalsIgnoreCase("CHF")) rate=exchangeRatesForCHF.getOrDefault(to,1.0);

        return rate;
    }

    public static void printTheResult (double amount, double rate, String fromCurrency, String toCurrency){

        System.out.println(amount+" "+fromCurrency+" = "+amount*rate+" "+toCurrency);
    }
}