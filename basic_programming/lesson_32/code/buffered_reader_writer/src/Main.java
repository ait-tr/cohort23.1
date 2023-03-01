import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));

//чтение по символам методом read
        try (FileReader fileReader = new FileReader("input.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {


            int c;

            while ((c = bufferedReader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.getMessage();
        }
        System.out.println("readline");
        // чтение по строкам методом readLine
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String str;

            while ((str = br.readLine()) != null) {

                System.out.println(str);
            }

        } catch (IOException e) {

            System.out.println("The system cannot find the file specified");
        }
/*
aaaa
cccc
dddd
readline
aaaa
cccc
dddd
 */
        //    String[] strings = {"input.txt","output.txt"};
        //    FileReader fr = new FileReader(strings[0]);
        //        FileReader fr = new FileReader("input.txt");

        //запись символов  в файл с помощью BufferedWriter
        try (FileWriter fileWriter = new FileWriter("output.txt", true);
             // try( FileWriter fileWriter = new FileWriter("out.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            String string = "Hello World";
            bufferedWriter.write(string);
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
// считывание с клавиатуры в файл
        //BufferedReader  в данном случае устанавливает связь с консолью через InputStreamReader.
        // Строчки с клавиатуры считываеются в цикле While до того момента, пока пользователь не введет строку stop
        //Текст записывается в файл fromConsole с помощью BufferedWriter.  Сам файл автоматически создается
        // FileWriter-ом
        try (InputStreamReader inputStreamReader = new InputStreamReader(System.in);
             BufferedReader bufferedReader1 = new BufferedReader(inputStreamReader);
             BufferedWriter bw = new BufferedWriter(new FileWriter("fromConsole.txt", true))) {
            // InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            // BufferedReader bufferedReader1 = new BufferedReader(inputStreamReader);
            //  BufferedWriter bw = new BufferedWriter(new FileWriter("fromConsole.txt",true));

            //читает по строкам
            String line;
            while (!(line = bufferedReader1.readLine()).equalsIgnoreCase("STOP")) {

                bw.write(line + "\n");

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}

