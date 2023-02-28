
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)//throws IOException
    {
        System.out.println(Arrays.toString(args));
        System.out.println(args[0]);
        //                          IO Streams
        /*
        Byte streams (байтовые потоки)        Character streams (символьные стримы)
        InputStream      OutputStream         Reader             Writer
        ____________________________________________________________________________

         predefined streams ( уже определенные потоки)
        System.out
        System.in
        System.err
         */

        //  System.in.read()
        //  read(byte[]data)

        byte[] data = new byte[10];
        System.out.println("Enter something");
        //    System.in.read(data);

        //    System.out.println("You entered ");
        for (int i = 0; i < data.length; i++) {
            //       System.out.print((char) data[i]);
        }

        /*
Enter something
Read bytes
You entered
Read bytes
         */


        // чтение из файла через FileInputStream

        //close()

  /*      int i;
        FileInputStream fin;
     //   FileInputStream fin = new FileInputStream("TEST.txt");

        if(args.length !=1){
            System.out.println("need file name");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
        }catch (FileNotFoundException e){
            System.out.println("File not found");
            return;
        }
        //читаем байты из файла пока не достигнем конца файла

        try {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        }catch (IOException e){
            System.out.println("Error reading file");
        }
        try {
            fin.close();
        }catch (IOException e){
            System.out.println("Error reading file");
        }

      */

        int i;
        FileInputStream fin = null;
        //   FileInputStream fin = new FileInputStream("TEST.txt");

        if (args.length != 1) {
            System.out.println("need file name");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);

            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error reading file");
        } finally {
            //закрывает файлы в любом случае

            try {
                if (fin !=null) {
                    fin.close();
                }
            } catch (IOException e) {
                System.out.println("Error reading file");
            }
        }

// запись в файл  FileOutputStream( String fileName)
        //  FileOutputStream( String fileName,boolean append)
        //  write()

        //копировать текстовый файл
        int j;
        FileInputStream fileInputStream =null;
        FileOutputStream fileOutputStream=null;

        try {
            fileInputStream = new FileInputStream("TEST.txt");
            fileOutputStream = new FileOutputStream("ToFile.txt",true);
            do {
                j =fileInputStream.read();
                if(j !=-1) fileOutputStream.write(j);
            }while (j != -1);
        }catch (IOException e){
            System.out.println("I/O Error");
        }finally {
            try{
                if(fileInputStream != null) fileInputStream.close();
            }catch(IOException e){
                System.out.println("error closing input file");
            }try{
                if(fileOutputStream != null) fileOutputStream.close();
            }catch(IOException e){
                System.out.println("error closing output file");}
        }

        //Character streams

        //Buffered Reader








    }
}
