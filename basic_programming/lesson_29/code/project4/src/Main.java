
import java.io.IOException;
import java.util.*;
public class Main{
    public static void  main(String[] args) throws IOException {

        currencyConverter();
/*
Vorgehensweise:
Erstellung der Klasse "CurrencyConverter"
Auswahlmöglichkeit der Währung
"Scanner" erstellen
Eingabe der Währung über "Scanner"
Auswahl des Betrages
Eingabe über den "Scanner"
erstellen switchCase Methode um den Zugriff auf
    die entsprechende Währung zu ermöglichen

Erstellen der Methoden für jede gewählte Ausgangswährung
(double- da Komma-Beträge)
EUR
USD
GBP
RUB
    */


    }
    public static void currencyConverter(){


        String repeat ="N";
        do {
            System.out.println();
            System.out.println("Choose the currency : ");
            System.out.println("1 EUR " + " 2 USD " + " 3 GBP " + " 4 RUB ");
            System.out.println();

            Scanner sc = new Scanner(System.in);

            int choice = sc.nextInt();
            while (choice >=5) {
                System.out.println("Your enter is false!");
                System.out.println();
                System.out.println("Choose the currency : ");
                System.out.println("1 EUR " + " 2 USD " + " 3 GBP " + " 4 RUB ");
                choice = sc.nextInt();
            }

            System.out.println("Choose the change currency : ");
            System.out.println("1 EUR " + " 2 USD " + " 3 GBP " + " 4 RUB ");
            System.out.println();

            int change = sc.nextInt();
            while (change >=5) {
                System.out.println("Your enter is false!");
                System.out.println();
                System.out.println("Choose the change currency : ");
                System.out.println("1 EUR " + " 2 USD " + " 3 GBP " + " 4 RUB ");
                change = sc.nextInt();
            }


            System.out.println("Enter the amount :");
            double amount = sc.nextInt();




            if (choice == 1 && change == 2) {
                EUR_to_USD(amount);
            } else if (choice == 1 && change == 3) {
                EUR_to_GBP(amount);
            } else if (choice == 1 && change == 4) {
                EUR_to_RUB(amount);
            } else if (choice == 2 && change == 1) {
                USD_to_EUR(amount);
            } else if (choice == 2 && change == 3) {
                USD_to_GBP(amount);
            } else if (choice == 2 && change == 4) {
                USD_to_RUB(amount);
            } else if (choice == 3 && change == 1) {
                GBP_to_EUR(amount);
            } else if (choice == 3 && change == 2) {
                GBP_to_USD(amount);
            } else if (choice == 3 && change == 4) {
                GBP_to_RUB(amount);
            } else if (choice == 4 && change == 1) {
                RUB_to_EUR(amount);
            } else if (choice == 4 && change == 2) {
                RUB_to_USD(amount);
            } else if (choice == 4 && change == 3) {
                RUB_to_GBP(amount);
            } else {
                System.out.println("Invalid choice");

            }

            System.out.println("Nochmal (Y/N)?");

            repeat = sc.next();

        }  while (repeat.equalsIgnoreCase("Y"));


    }

    public static void EUR_to_USD(double amt) {
        System.out.println("1 EUR = " + 1.09 + " USD");
        System.out.println();
        System.out.println(amt + " EUR = " + (double) Math.round ((amt * 1.09)*100)/100 + " USD");
        System.out.println();
    }
    public static void EUR_to_GBP(double amt) {

        System.out.println("1 EUR = " + 88.58 + " GBR");
        System.out.println();
        System.out.println(amt + " EUR = " + (double) Math.round((amt * 88.58)*100)/100 + " GBR");
        System.out.println();
    }
    public static void EUR_to_RUB(double amt) {
        System.out.println("1 EUR = " + 79.76 + " RUB");
        System.out.println();
        System.out.println(amt + " EUR = " + (double) Math.round((amt * 79.76)*100)/100 + " RUB");
        System.out.println();
    }
    public static void USD_to_EUR(double amt) {
        System.out.println("1 USD = " + 0.95 + " EUR");
        System.out.println();
        System.out.println(amt + " USD = " +(double) Math.round ((amt * 0.95)*100)/100 + " EUR");
        System.out.println();
    }
    public static void USD_to_GBP(double amt) {
        System.out.println("1 USD= " + 0.83 + " GBP");
        System.out.println();
        System.out.println(amt + " USD = " + (double) Math.round((amt * 0.83)*100)/100 + " GBP");
        System.out.println();
    }
    public static void USD_to_RUB(double amt) {
        System.out.println("1 USD = " + 74.86 + " RUB");
        System.out.println();
        System.out.println(amt + " USD = " + (double) Math.round((amt * 74.86)*100)/100 + " RUB");
        System.out.println();
    }
    public static void GBP_to_EUR(double amt) {
        System.out.println("1 GBP = " + 1.13 + " EUR");
        System.out.println();
        System.out.println(amt + " GBP = " + (double) Math.round((amt * 1.13))*100/100 + " EUR");
        System.out.println();
    }
    public static void GBP_to_USD(double amt) {
        System.out.println("1 GBP = " + 1.20 + " USD");
        System.out.println();
        System.out.println(amt + " GBP = " + (double) Math.round((amt * 1.20)*100)/100 + " USD");
        System.out.println();
    }
    public static void GBP_to_RUB(double amt) {
        System.out.println("1 GBP = " + 90.04 + " RUB");
        System.out.println();
        System.out.println(amt + " GBP = " + (double) Math.round(amt * 90.04)*100/100 + " RUB");
        System.out.println();

    }
    public static void RUB_to_EUR(double amt) {
        System.out.println("1 RUB = " + 0.012 + " EUR");
        System.out.println();
        System.out.println(amt + " RUB = " + (double) Math.round((amt * 0.012)*100)/100 + " EUR");
        System.out.println();
    }
    public static void RUB_to_USD(double amt) {
        System.out.println("1 RUB = " + 0.075 + " USD");
        System.out.println();
        System.out.println(amt + " RUB = " + (double) Math.round((amt * 0.075)*100)/100 + " USD");
        System.out.println();
    }
    public static void RUB_to_GBP(double amt) {
        System.out.println("1 RUB = " + 0.01+ " GBP");
        System.out.println();
        System.out.println(amt + " RUB = " +(double) Math.round( (amt * 0.01)*100)/100 + " GBP");
        System.out.println();

    }
}









