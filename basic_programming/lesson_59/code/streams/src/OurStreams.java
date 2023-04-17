import java.util.Arrays;
import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OurStreams {

    // Stream API
    /*
     создание стримов

     */
    public static void main(String[] args) {
        Stream<String> streamEmpty = Stream.empty();

        Collection<String> collection = Arrays.asList("aa","bb","cc");
        collection.stream();

        String[] arr = {"aa","bb","cc"};
        Arrays.stream(arr);
        //  существует возможность создавать стримы трех примитивных типов:
         // IntStream
        // LongStream
        //DoubleStream

        // Stream of String
        IntStream streamOfChars = "hello".chars();



        int[] ints = {1,3,5,65,7,9,70};
        int count =0;

        for ( int i : ints){
            if(i>60){
                continue;
            }
            i += 1;
            count++;
            if(count>4)break;
            System.out.println(i);
        }


        IntStream.of(1,3,5,65,7,9,70).filter(i -> i<60)
                .map(i ->i+1)
                .limit(4)
                .forEach(System.out::print);

    }
}
