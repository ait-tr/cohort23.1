public class Main {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle("Rectangle",5,10);
        Shape square = new Square("Square",7);
        Shape circle = new Circle("Circle",10);
        Shape shape = new Shape("Shape");

        //rectangle.

        //int[] ints
        Shape[] shapes = {circle,rectangle,square,shape};

        System.out.println("Shapes: ");
        for(Shape s:shapes){
            System.out.println(s.getDisplayName()+" has area of "+s.getArea());
        }
    }
}
