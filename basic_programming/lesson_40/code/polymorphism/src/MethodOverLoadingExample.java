public class MethodOverLoadingExample {

    int add(int a,int b){

        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    int add(int a, float b){
        return a+(int)b;
    }

    int add(float a, int b){
        return (int)a+b;
    }
}
