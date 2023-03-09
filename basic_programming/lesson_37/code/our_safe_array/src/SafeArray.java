// int[] arr = new int[2];
//get(int index) -> arr[index]
//put(int index, int value) -> true
//put(0,25)
//put(1,35)
//[25,35]
//get(0) -> 25
// get(1) -> 35
//put(3,45)-> exception
//get(3)-> exception
// 0<=index<length
// arr[4]=1234;
//sout(arr[5])

//
// создать класс , в котором предусмотрено безопасное использование массива
// т.е предупреждаются возможные ошибки выхода за границы массива с выбросом exception
// Для этого мы создадим наш  массив непосредственно в классе и сделаем его приватным.
// Доступ к массиву будет возможен только через методы класса,
// обеспечивающие безопасную работу
public class SafeArray {
    private int[] array; // ссылка на наш массив
    //public int[] array; // ссылка на наш массив
    private int errorValue;
    public int length;

    public SafeArray (int length, int errorValue){
        array = new int[length];
        this.errorValue = errorValue;
        this.length = length;
    }
    //метод get  возвращает  значение элемента массива по заданному индексу если оно
    // находится в границах массива и дефолтное значение если нет
    public int get(int index){
        if(index>=0 & index<length) {
            return array[index];
        }
        return errorValue;
    }

    //записывает значение элемента по индексу. Возвращает false  в случае неудачи
    public boolean put(int index,int value){
        if(index>=0 & index<length){
            array[index]=value;
            return true;
        }
        return false;
    }

  /*  private boolean indexGood(int index){
        if(index>=0 & index<length) return true;
        return false;
    }*/

}
