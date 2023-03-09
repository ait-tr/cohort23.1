//static block example. Пример статического блока
public class StaticBlock {
    static double rootOf2;
    static double rootOf3;

    // статический блок
    static {
        System.out.println("Inside Static Block");
       rootOf2 = Math.sqrt(2.0);
       rootOf3 = Math.sqrt(3.0);
    }

    StaticBlock(String message){
        System.out.println(message);
    }

    // static final variables - статические переменные fianl  ( константы)
    //Должна быть инициализирована при создании, изменить ее значение в дальнейшем
    // можно только в классе где она создана.
    public  static final int MY_INT=30;
}
