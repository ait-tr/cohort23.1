import java.io.*;

public class Main {
    public static void main(String[] args)// throws IOException
    {


        // создание файлов с помощью класса File

        File file = new File("input.txt");
        //    boolean isCreated = file.createNewFile();
        //     System.out.println(isCreated);

        //     FileReader fileReader = new FileReader(file);


        //     boolean exist =  file.exists();
        //      System.out.println("exist="+exist);

        readWrite("input.txt", "output.txt");

    }

    // написать метод, который построчно читает содержимое из одного файла и
    // записывает его одновременно в другой

    public static void readWrite(String input, String output) {
        try (BufferedReader br = new BufferedReader(new FileReader(input));
             BufferedWriter bw = new BufferedWriter(new FileWriter(output, true))) {
            String line = "";

            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

        } catch (IOException exception) {

            exception.getMessage();
        }

    }
}