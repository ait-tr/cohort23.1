public class PizzaHawaii extends Pizza{
    private static String TYPE = "Pizza Hawaii";

    public PizzaHawaii(){
        super(TYPE);
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing pizza with pineapple and cheese");
    }
}
