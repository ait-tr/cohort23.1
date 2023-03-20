public class Flower extends Plant{

    public Flower(String displayName, int height, int age){
        super(displayName,height,age);
    }

    private static int FLOWER_GROW_PER_SEASON = 2;

    public void doSummer(){
        System.out.println(getDisplayName()+" is not growing in Summer, but flourishing "+getHeight());
    }

    public void doAutumn(){
        setHeight(0);
        System.out.println(getDisplayName()+" is cut to zero in Autumn "+getHeight());
    }

    public int getGrowPerSeason(){
        return FLOWER_GROW_PER_SEASON;
    }
}
