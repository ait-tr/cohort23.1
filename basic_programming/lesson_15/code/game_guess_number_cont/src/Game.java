import java.util.Scanner;

public class Game {
    static Scanner scanner = new Scanner(System.in);
    static int secret = 9;

    public static void main(String[] args) {

        start();

    }

    public static void start(){
        int attempts = readNumberOfAttempts();
        guessNumber(attempts);
        scanner.close();
    }



    private static int readNumberOfAttempts(){
        System.out.println("Enter number of attempts ");
        // int number=scanner.nextInt();
        return scanner.nextInt();
    }

    private static int readNumber(){
        System.out.println("Enter the number from 0 to 9 ");

        return scanner.nextInt();
    }

    static void guessNumber (int attempts){
        while (attempts>0){
            int number = readNumber();
            attempts--;

            if(number == secret){
                System.out.println("You have guessed the secret number!");
                return;

            } else {
                System.out.println("Wrong! You have "+ attempts+" attempts left.");
            }
        }
        System.out.println("Game is over. Sorry, buddy. Maybe some other time");
    }
}