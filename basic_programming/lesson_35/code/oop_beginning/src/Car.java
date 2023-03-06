public class Car {

    //   Car(){
    //       System.out.println("a new car is constructed");
    //   }


    String brand;
    String colour;
    int year;

    Car() {

    }

    Car(String brand, String colour, int year) {
        this.brand = brand;
        this.colour = colour;
        this.year = year;
    }

  /*  Car(String brand, String carColour, int carYear){
        this.brand=brand;
        colour = carColour;
        year = carYear;
    }*/

    Car(String brand, String colour) {
        this.brand = brand;
        this.colour = colour;
        this.year = 2021;
    }

    void breakCar() {
        System.out.println("The car stops");
    }

    void accelerate() {
        System.out.println("The car accelerates");
    }
}
