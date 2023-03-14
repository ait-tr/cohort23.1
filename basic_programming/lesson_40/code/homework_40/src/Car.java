public class Car {
    String model;
    String colour;
    int productionYear;

    public Car (String model,
                String colour,
                int productionYear){
        this.model = model;
        this.colour = colour;
        this.productionYear = productionYear;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void start(){
        System.out.println("The car begins to move");
    }

    public void stop(){
        System.out.println("The car stops");
    }
}
