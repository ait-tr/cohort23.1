public class Main {

    //StringBuilder class - в отличие от класса String  создает изменяемый string
    // конструкторы
    // StringBuilder()-  пустой стрингбилдер
    // StringBuilder(String str)- стрингбилдер со строкой str
    // StringBuilder(int length) -пустой, но с определенной длиной

    public static void main(String[] args) {

        //append method - присоединить, аналогично + или concat  со строками
        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println(stringBuilder);
        stringBuilder.append(" World");
        System.out.println(stringBuilder);

        //insert()
        stringBuilder.insert(1,"Java");
        System.out.println(stringBuilder);

        //replace
        stringBuilder.replace(1,3,"Algo");
        System.out.println(stringBuilder);

        /*
        Hello
Hello World
HJavaello World
HAlgovaello World
         */
        StringBuilder sb = new StringBuilder("Hello");
        sb.reverse();
        System.out.println(sb);
    }
}
