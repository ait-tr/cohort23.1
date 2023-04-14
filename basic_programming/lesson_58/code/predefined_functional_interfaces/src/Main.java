import java.util.function.*;

public class Main {
    // predefined functional interfaces
    /*
    Стандартные функциональные интерфейсы:

   1. Function<T,R>  - это метод  преобразующий обьект типа Т в обьект типа R
    public interface Function<T,R>{
       R apply(T ob )}

    2.Predicate<T> -проверяет условие. Если условие выполняется возвращает true  иначе false
    public interface Predicate<T>{
       boolean test( T ob)
    }
    3. Consumer<T> - принимает обьект, но ничего не возвращает
        public interface Consumer<T>{
          void accept( T ob);
        }
     4. Supplier<T> - ничего не принимаетЮ но возвращает  обьект   типа T
     public interface Supplier<T>{
      T get()
     }

     BinaryOperator<T> - принимает два обьекта типа T и возвращает обьект тоже типа T
     public interface BinaryOperator<T>{
      T apply ( T ob1, T ob2);
     }

     UnaryOperator<T>  -аналог Function   для случая когда на входе и выходе один тип
    public interface UnaryOperator<T>{
     T apply(T ob)
    }


     */
    public static void main(String[] args) {
        Function<Integer,String> intToString = num -> String.valueOf(num);
        intToString.apply(2);
        Predicate<Integer> isPostive = num -> num>0;
        isPostive.test(3);

        Consumer<String> consumer = s-> System.out.println(s);
        consumer.accept("Hello");

        Supplier<String> supplier = ()->"Hello World";
        BinaryOperator<Integer> sum = (num1,num2)->num1 + num2;
        sum.apply(1,2);

        UnaryOperator<Integer> isSquare = num -> num*num;
        isSquare.apply(2);
    }


}
