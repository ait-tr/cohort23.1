import java.util.Objects;

public class Order {
    private int id;
    private String name;

    public Order(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object o){
        if( this == o) return true;
        if(!(o instanceof Order)) return false;
        Order order =(Order) o;
        return id == order.id && name.equals(order.name);
    }

  /*  @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && Objects.equals(name, order.name);
    }*/

   // public int hashCode(){
      //  return Objects.hash(id,name);
    //    return 31*hashCode()+id;
   // }


    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
