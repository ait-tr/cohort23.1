public class PizzaMozarella extends Pizza{
    private static String TYPE = "Pizza Mozarella";

    public PizzaMozarella(){ super(TYPE);}

    @Override
    protected void prepare() {
        System.out.println("Preparing pizza with mozarella cheese");
    }
}
