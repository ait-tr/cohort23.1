public class Demo {
    public static void main(String[] args) {

        //speed test
        long startTime = System.currentTimeMillis();
        concatString();
        System.out.println("Time taken by concating with Strings "+(System.currentTimeMillis()-startTime)+"ms");

        long startTime1 = System.currentTimeMillis();
        concatStringBuilder();
        System.out.println("Time taken by concating with StringBuilder "+(System.currentTimeMillis()-startTime1)+"ms");
    /*
    Time taken by concating with Strings 131ms
Time taken by concating with StringBuilder 2ms
     */

        //hash code test
        System.out.println("Hashcode test for String");
        String str = "java";
        System.out.println(str.hashCode());
         str = str + " hello";
        System.out.println(str.hashCode());


        System.out.println("Hashcode test for StringBuilder");
        StringBuilder sb = new StringBuilder("java");
        System.out.println(sb.hashCode());
        sb.append(" hello");
        System.out.println(sb.hashCode());

        /*
Hashcode test for String
3254818
2111976788
Hashcode test for StringBuilder
1149319664
1149319664
         */
    }


    public static String concatString(){
        String str = "Hello";
        for(int i = 0;i<10000;i++){
            str = str + " World";
        }
        return str;
    }


    public static String concatStringBuilder(){
        StringBuilder sb = new StringBuilder("Hello");

        for (int i = 0;i<10000;i++){
            sb.append(" World");
        }
        return sb.toString();
    }




}
