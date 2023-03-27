import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTasks {

    //Есть список с именами. Написать метод, возвращающий лист без имен длиной
    // 4 символа
    // John, Pablo, Ann, Jack -> Pablo, Ann
    public List<String> removeNamesLength4(List<String> names){
        List<String> res = new ArrayList<>();
        for (String name:names){
            if(name.length() != 4) res.add(name);
        }
        return res;
    }

    /*
    Есть два списка одинаковой длины с целыми числами. Написать метод, который возвращает
    список с элементами Yes или No,
    где значение на i-том месте зависит от того , равны ли элементы двух списков под номер i

    [2, 4,  6,  8]
    [5, 4  ,6,  9] ->
    [No Yes Yes No]
     */

    public List<String> compareYesNo(List<Integer>ints1, List<Integer>ints2){
        List<String> res = new ArrayList<>();

        for(int i = 0;i<ints1.size();i++){
          //  if(ints1.get(i) == ints2.get(i))
            if(ints1.get(i).equals(ints2.get(i)))
                res.add("Yes");
            else
                res.add("No");
        }
        return res;
    }

    // Написать метод, который реверсирует лист.т.е. возвращает список элементов
    // в обратном порядке

    //[1,2,3,4,5] ->[5,4,3,2,1]

    public List<Integer> reversed(List<Integer>ints){
        Collections.reverse(ints);
        return ints;
    }

    /*
    Есть два класса: Address  с полями String street  и int houseNumber  и Person  с полями String name  и
    Address address.  Нужно написать метод List<Address> getAddresses(List<Person> persons)  то есть по списку persons будет
    возвращать список их адресов и протестировать его !

     */
    List<Address> getAddresses(List<Person> persons){
        List<Address> addresses = new ArrayList<>();

        for (Person p: persons){
            Address personAddress = p.getAddress();
            addresses.add(personAddress);
        }
        return addresses;
    }
}
