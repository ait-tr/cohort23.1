public class Car {
  private String name;
  private int year;

  static int  numberOfCars;

  public Car(String name, int year){
      this.name=name;
      this.year=year;
      numberOfCars++;
  }
  public String getName(){
      return name;
  }

  public int getYear(){
      return year;
  }




}
