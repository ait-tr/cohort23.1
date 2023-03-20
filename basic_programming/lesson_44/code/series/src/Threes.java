public class Threes implements Series {

    int start;
    int value;


    public Threes(){
        start = 0;
        value = 0;

    }

    public int getNext(){
        value += 3;
        return value;
    }

    public void reset(){
        value = start;

    }

    public void setStart(int x){
        start = x;
        value = x;

    }

}
