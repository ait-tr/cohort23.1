import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        //   сurrencyConvertor();


        String[] strings = {"AA", "BB", "AA", "CC", "BB" }; // > {AA:true, BB: true, CC: false}
        //   String[] strings = {"AA","AA"}; // > {AA:true}
        System.out.println(mapStringBoolean(strings));

    }

    /**
     * Есть не пустой массив строк. Написать метод, возвращающий мапу Map
     * где каждая строка является ключом, а значением является true если
     * строка в массиве встречается больше одного раза и false если только
     * один раз.
     * Map mapStringBoolean( String[] strings)
     * Примеры:
     * [a,b,a,c,b] -> {a:true, b: true, c: false}
     * [a,b,c,] -> {a:false, b: false, c: false}
     * [c,c,c,] -> {c: true}
     */
    //  String[] strings = {"AA","BB","AA","CC","BB"}
    public static Map<String, Boolean> mapStringBoolean(String[] strings) {
        Map<String, Boolean> nameToBoolean = new HashMap<>();
//  String[] strings = {"AA","BB","AA","CC","BB"}
        for (String s : strings) { // AA
            if (nameToBoolean.containsKey(s)) {
                nameToBoolean.put(s, true);
            } else {
                nameToBoolean.put(s, false);  // nameToBoolean: {AA=false}
            }
            System.out.println(nameToBoolean);
        }
        return nameToBoolean;
    }
    /*
{AA=false}
{AA=false, BB=false}
{AA=true, BB=false}
{AA=true, BB=false, CC=false}
{AA=true, BB=true, CC=false}
{AA=true, BB=true, CC=false}

     */
}