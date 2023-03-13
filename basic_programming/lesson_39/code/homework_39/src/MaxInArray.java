public class MaxInArray {
    private int[] ints;

    public  MaxInArray(int[]ints){
        this.ints = ints;
    }

    public int findMax(){
        int max = ints[0];

        for(int i = 1;i<ints.length;i++){
            if( ints[i]>max){
                max = ints[i];
            }
        }
        return max;
    }
}
