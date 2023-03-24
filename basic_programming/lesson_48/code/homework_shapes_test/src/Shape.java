public abstract class Shape implements Comparable<Shape> {

    private String displayName;

    public Shape(String displayName){
        this.displayName = displayName;
    }

    public abstract double getArea();

    public String getDisplayName(){
        return displayName;
    }

    public int compareTo(Shape o){
      //  return Double.compare(getArea(),o.getArea());
      //  return (int) (getArea() - o.getArea());
        //getArea = 0,2
        //o.getArea = 0.1
        if(getArea() - o.getArea()>0){
            return 1;
        } else if (getArea()-o.getArea()<0) {
            return -1;
        }else return 0;
    }
}
