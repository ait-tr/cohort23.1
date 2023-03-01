
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {

        // 1. пишем имя файла, к которому подключаемся непосредственно в скобках за ридером

        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));

        // 2.задать имя файла в строковой переменной
        String fileName = "input.txt";
        reader = new BufferedReader(new FileReader(fileName));

        //3. через создание файла  File
        File file = new File("input1.txt");

        reader = new BufferedReader(new FileReader(file));

        boolean created = file.createNewFile();
        //   System.out.println(created);
    }
}
