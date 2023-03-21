public class Circle implements Shape{

    int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public double perimeter(){
        return 2*3.14*radius;
    }

    public double area(){
        return 3.14*radius*radius;
    }
}
