import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static char currencyGive=0;
    static char currencyTake=0;
    static int value=0;
    static String choice;








    public static void main(String[] args) {
        start();
    }
    public static void start(){

        for(int i=0; i<100; i--){
            System.out.println("Want to change money? ");
            System.out.println("Press 1 if yes or 2 if no");
            Scanner scanner2 = new Scanner(System.in);
            choice = scanner2.nextLine();
            if (choice.equals("2")) {
                System.out.println("See you ");
                return;
            }else if (choice.equals("1")) {
                currencyForExchange();
                currencyAmount();
                exchangedCurrency();
                System.out.println(calculate());
            }else  {
                System.out.println("This option is not exist");
            }

        }
    }
    public static void currencyForExchange() {
        System.out.println("We have 3 currencies: U.USD, E.EUR, G.GBP");
        System.out.print("Enter a letter of the currency you want to exchange. U,E or G: ");
        currencyGive = scanner.next().charAt(0);


    }
    public static void currencyAmount() {
        boolean flag;
        do {
            flag = false;
            Scanner scanner1= new Scanner(System.in);
            System.out.print("Enter the amount you want to exchange: ");
            try {
                value = scanner1.nextInt();
            } catch (Exception exception) {
                //currencyConverter();
                System.out.println("You can enter only numbers!");
                flag = true;
            }
        }while (flag);
    }
    public static void exchangedCurrency() {
        System.out.print("Enter a letter of the currency you want to receive. U,E or G:");
        currencyTake = scanner.next().charAt(0);
    }
    public static double calculate (){
        double result=0;
        switch (currencyGive) {
            case 'U':
                if(currencyTake=='E'){
                    result = value * 0.94;

                } else if (currencyTake == 'G') {
                    result = value * 0.83;
                } else{
                    System.out.println("Sorry, we don't have this currency \n ");
                }
                break;
            case 'E':
                if(currencyTake=='U'){
                    result=value*1.06;
                }
                else if(currencyTake=='G') {
                    result = value * 0.88;
                } else{
                    System.out.println("Sorry, we don't have this currency \n");
                }
                break;
            case 'G':
                if(currencyTake=='U') {
                    result = value * 1.21;
                }
                else if(currencyTake=='E') {
                    result = value * 1.14;
                }else{
                    System.out.println("Sorry, we don't have this currency \n ");
                }
                break;
            default:
                System.out.println("Sorry, we don't have this currency \n ");

        }
        System.out.println();
        return result;
    }




}