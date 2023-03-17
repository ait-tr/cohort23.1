import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        PizzaFactory factory = new PizzaFactory();


        String salami = "PIZZA_SALAMI";
        PizzaType pizzaType = PizzaType.valueOf(salami);
        Pizza pizzaSalami = factory.createPizza(pizzaType);
        pizzaSalami.orderPizza();

        System.out.println("-------------------------------");

        String hawaii = "PIZZA_HAWAII";
        PizzaType pizzaType1 = PizzaType.valueOf(hawaii);
        Pizza pizzaHawaii = factory.createPizza(pizzaType1);
        pizzaHawaii.orderPizza();

        System.out.println("-------------------------------");

        String mozarella = "PIZZA_MOZARELLA";
        PizzaType pizzaType2 = PizzaType.valueOf(mozarella);
        Pizza pizzaMozarella = factory.createPizza(pizzaType2);
        pizzaMozarella.orderPizza();

/*
Preparing pizza with salami,cheese,tomatoes
Baking Pizza Salami
Packing Pizza Salami
-------------------------------
Preparing pizza with pineapple and cheese
Baking Pizza Hawaii
Packing Pizza Hawaii
-------------------------------
Preparing pizza with mozarella cheese
Baking Pizza Mozarella
Packing Pizza Mozarella
 */
        System.out.println("------------------With scanner and loop---------------------------");

        Scanner scanner = new Scanner(System.in);

        do{
            PizzaType pizzaTypeFromScanner = null;
            boolean flag;

            do {
                flag = false;
                System.out.println("We have three pizza types. Enter the following:");
                System.out.println("PIZZA_SALAMI for salami");
                System.out.println("PIZZA_HAWAII for hawaii");
                System.out.println("PIZZA_MOZARELLA for mozarella");

                String pizzaChoice = scanner.nextLine();
                try {
                    pizzaTypeFromScanner = PizzaType.valueOf(pizzaChoice.toUpperCase());
                } catch (IllegalArgumentException e) {
                    System.out.println("Please make a valid choice");
                    flag = true;
                }
            }while(flag);

             Pizza newPizza = factory.createPizza(pizzaTypeFromScanner);
             newPizza.orderPizza();

            System.out.println("Do you want to order another pizza? press no if not or any other key if yes");

        }while (!scanner.nextLine().equalsIgnoreCase("no"));

        System.out.println("Thank you for your order! Enjoy your pizza");


    }
}
