public class Main {

    public static void main(String[] args) {


        Car car = new Car("VolvoTruck", "White", 2000);
        PassengerCar volvo = new PassengerCar("Volvo","Red",2023,5);
        Truck volvoTruck = new Truck(car.getModel(),car.colour,car.getProductionYear(),1600);

        System.out.println("The car is "+volvoTruck.model);
        System.out.println("colour is "+volvoTruck.colour);
        System.out.println("year is "+volvoTruck.productionYear);
    }
}
