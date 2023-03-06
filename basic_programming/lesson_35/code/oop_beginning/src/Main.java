public class Main {
    //Классы и обьекты

    public static void main(String[] args) {
        Car volvo = new Car();
        volvo.brand ="Volvo";
        volvo.colour = "Black";
        volvo.year=2020;
        System.out.println("Volvo car: ");
        System.out.println("Car brand: "+volvo.brand);
        System.out.println("Car colour: "+volvo.colour);
        System.out.println("Car production year: "+volvo.year);

        Car audi = new Car();
        audi.brand ="Audi";
        audi.colour="White";
        audi.year=2023;

        System.out.println("Audi car: ");
        System.out.println("Car brand: "+audi.brand);
        System.out.println("Car colour: "+audi.colour);
        System.out.println("Car production year: "+audi.year);
 /*
 Car brand: Volvo
Car colour: Black
Car production year: 2020
Car brand: Audi
Car colour: White
Car production year: 2023
  */
        volvo.accelerate();
        volvo.breakCar();
        System.out.println("Constructor car:");
        Car constructorCar = new Car();
        System.out.println("Car brand: "+constructorCar.brand);
        System.out.println("Car colour: "+constructorCar.colour);
        System.out.println("Car production year: "+constructorCar.year);

      /*
Constructor car:
Car brand: Volvo
Car colour: Green
Car production year: 2000
       */

//Конструктор с параметрами
        Car opel =new Car("Opel","Red",1999);

        System.out.println("Car brand: "+opel.brand);
        System.out.println("Car colour: "+opel.colour);
        System.out.println("Car production year: "+opel.year);

      /*
Car brand: Opel
Car colour: Red
Car production year: 1999

       */
        System.out.println();
        System.out.println("Jeep car");
        Car jeep = new Car("Jeep","Green");
        System.out.println("Car brand: "+jeep.brand);
        System.out.println("Car colour: "+jeep.colour);
        System.out.println("Car production year: "+jeep.year);
/*
Jeep car
Car brand: Jeep
Car colour: Green
Car production year: 2021
 */



    }
}
