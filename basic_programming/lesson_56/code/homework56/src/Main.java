import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        File filename = new File ("input.txt");

        System.out.println(readIntoString(filename));
        System.out.println("The longest line is "+findLongestLine(filename));

        System.out.println(composeList("inputList.txt"));

        sumPurchases("inputFile.txt","outputFile.txt");
    }


    /*
    1.	Есть  текстовый файл.  Написать метод,  читающий файл и возвращающий строку, состоящую из строчек этого файла, разделенных пробелом.
Пример текстового файла:
aaa
bbbbbbb
cc
 результат : aaa bbbbbbb cc
 */
    public static String readIntoString (File filename) throws IOException {
        String str ="";

        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line;

            while((line = br.readLine())!=null){
                str = str +" "+line;
            }
        }
        return str.trim();
    }

/*
2.	Есть  файл, состоящий из строчек текста.  Написать метод,  читающий файл и находящий самую длинную строчку в этом файле. Метод возвращает эту строчку
Пример текстового файла:
aaa
bbbbbbb
cc
 результат :  bbbbbbb
*/
    public static String findLongestLine(File filename) throws IOException{
        String longest = "";

        try( BufferedReader br = new BufferedReader(new FileReader(filename))){
            String current;

            while((current = br.readLine()) != null){
                if ( current.length()>longest.length())
                    longest = current;
            }
        }
        return  longest;
    }


/*
3.	*(со звездочкой)
Есть  не пустой текстовый файл, состоящий из строчек, содержащих имя и возраст такого вида:
John,                                 3
Jack, 23
Jill, 19
Bill, 15
Ann, 54

Написать метод, читающий файл и возвращающий список из людей старше 18 лет отсортированный по возрасту.
*/
    public static List<Person> composeList(String fileName){

        List<Person> persons = new ArrayList<>();
        List<String> temp = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){

            String line;
            while ((line = bufferedReader.readLine()) != null){
                temp.add(line);
            }

        } catch (IOException e){
            e.printStackTrace();
        }

        for ( String s : temp){
            String[] nameAge = s.split(",");
            int age = Integer.parseInt(nameAge[1].trim());
            if ( age>18)
                persons.add( new Person(nameAge[0].trim(),age));
        }
        Collections.sort(persons);
        return persons;
    }


/*
4.	*(со звездочкой)
 Есть текстовый файл, содержащий информацию о клиенте, название устройства и цену.   Имена клиентов могут повторяться.
Файл имеет такой вид:
John, Smith, Notebook, 500
Jill, White, Mac,  800
John, Smith, Keybord,25
Ann, Green, Mousepad, 5
Jill, White, Apple,60

Написать метод, читающий информацию из файла, суммирующий цену для каждого покупателя  и записывающий результат в выходной файл. Этот файл будет иметь такой вид:
Ann Green 5
John Smith 500
Jill White 860
     */

    public static void sumPurchases ( String inFile, String outFile){
        try( BufferedReader br = new BufferedReader(new FileReader(inFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outFile,false))){

            String line;
            Map<String,Integer> result = new HashMap<>();

            while ((line = br.readLine()) != null){
                System.out.println(line);
                String[] entry = line.split(",");
                String name = entry[0].trim().concat(" ").concat(entry[1].trim());
                int price = Integer.parseInt(entry[3].trim());

                if(result.containsKey(name)){
                    int oldPrice =result.get(name);
                    result.put(name, price + oldPrice);
                }
                else
                    result.put(name,price);

            }
            for (Map.Entry<String,Integer> me: result.entrySet()){
                bw.write(me.getKey()+' '+me.getValue());
                bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
