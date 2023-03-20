public class Tree extends Plant{
    private static int TREE_GROW_PER_SEASON = 5;

    public Tree( String displayName, int height, int age){
        super(displayName, height, age);
    }

    public void doSummer(){
        setHeight(getHeight() + getGrowPerSeason());
        System.out.printf("%s has grown in Summer %d\n",getDisplayName(),getHeight());
    }

    public void doAutumn(){
        System.out.printf("%s is not growing in Autumn. %d\n",getDisplayName(),getHeight());
    }

    public int getGrowPerSeason(){
        return  TREE_GROW_PER_SEASON;
    }
}
