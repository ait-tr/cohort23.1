public class Main {
    public static void main(String[] args) {
        System.out.println(Directions.EAST);
        System.out.println(Directions.NORTH);
        System.out.println(Directions.SOUTH);
        System.out.println(Directions.WEST);

        Directions tr = Directions.WEST;

        switch (tr){
            case EAST :
                System.out.println("This is east");
                break;
            case WEST:
                System.out.println("This is west");
                break;
            case NORTH:
                System.out.println("This is north");
                break;
            case SOUTH:
                System.out.println("This is south ");
            default:
                System.out.println("You can go where you want");

        }
        // методы класса Enum: values()- содержит список всех констант нашего энума
        // enumeration
        System.out.println("---------------------");
        Directions.values();
        for (Directions dir:Directions.values()){
            System.out.println(dir);
        }

        //метод valueOf()- возвращает ту из констант энума, значение которой
        // соответствует строке, передаваемой в этом методе
        System.out.println(Directions.valueOf("SOUTH"));
        Directions south = Directions.valueOf("SOUTH");

        Directions west = Directions.WEST;

        /*
EAST
NORTH
WEST
SOUTH
         */


    }
}
