public class Rectangler implements Shape{
    int length;
    int width;

    public Rectangler(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double perimeter() {
        return 2*(length+width);
    }

    public double area(){
        return length*width;
    }
}
