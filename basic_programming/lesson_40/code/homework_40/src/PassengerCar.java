public class PassengerCar extends Car{

    int numberOfSeats;

    public PassengerCar(String model,
                        String colour,
                        int productionYear,
                        int numberOfSeats){
        super(model,colour,productionYear);
        this.numberOfSeats = numberOfSeats;
    }
}
