public class Truck extends Car {

    int loadCapacity;

    public Truck(String model,
                 String colour,
                 int productionYear,
                 int loadCapacity){
        super(model,colour,productionYear);
        this.loadCapacity = loadCapacity;
    }
}
