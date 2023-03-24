public class ShapeCalculator{

    public  double totalSquare(Shape[] shapes){
        double res = 0;
        for(Shape s: shapes){
            res += s.getArea();
        }
        return res;
    }



}



