public class Twos implements Series,OurConstants{
    int start;
    int value;
    int prev;

    public Twos(){
        start = 0;
        value = 0;
        prev = -2;
    }

    public int getNext(){
        prev = value;
        value += 2;
        return value;
    }

    public void reset(){
        value = start;
        prev = start-2;
    }

    public void setStart(int x){
        start = x;
        value = x;
        prev = x-2;
    }

     int getPrevious(){
        return prev;
    }
}
