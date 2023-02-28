
import java.io.*;

public class Main {
    public static void main(String[] args) //throws IOException
    {
        char c;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //   System.out.println("Enter characters, enter '.' to quit");

        //   do {
        //      c = (char)br.read();
        //      System.out.println(c);
        //  }while(c !='.');

        //_________________________________________________________________________

        // FileReader-  чтение файла

        String s;
        try( BufferedReader bufferedReader =  new BufferedReader(new FileReader("TEST.txt")))
        {
            while((s = bufferedReader.readLine())!=null){
                System.out.println(s);
            }
        }catch(IOException exception){
            System.out.println("IO Error");
        }

        // FileWriter

        String str;
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter text . 'stop' to quit");

        try(FileWriter fw = new FileWriter("ToFile.txt")){
            do{
                str=bufferedReader.readLine();

                if(str.equals("stop")) break;
                str =str+"\n";
                fw.write(str);
            }while(!str.equals("stop"));
        }catch (IOException e){
            System.out.println("I/O Error");
        }


    }


}
