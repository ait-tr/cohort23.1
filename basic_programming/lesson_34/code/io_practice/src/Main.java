
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Integer.parseInt("2");

        sum("numbers.txt", "numbersOut.txt");
    }

    //написать метод, который читает из файла два числа и записывает во
    // второй файл их сумму а также выводит ее на экран
    // их сумму
    // Integer.parseInt("2");
    public static void sum(String fileIn, String fileOut) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileIn));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int sum = x + y;
        System.out.println(sum);

        BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut));
        bw.write(" " + sum);

        bw.close();
    }
}
//1.создать BufferedReader
//2.прочитать каждую из двух строк в которых содержатся числа  из файла
//3. преобразовать эти строки в целые числа с помощью метода Integer.parseInt
//4. сложить их
//5. в ывести на экран сумму
//6. создать BufferedWriter и записать сумму в новый файл