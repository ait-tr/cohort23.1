public abstract class Plant {

    private String displayName;
    private int height;
    private int age;

    public Plant(String displayName, int height, int age){
        this.displayName = displayName;
        this.height = height;
        this.age = age;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void addYearToAge(){
        this.age++;
    }

    public abstract int getGrowPerSeason();

    public void doSpring(){
        addYearToAge(); // new year starts in Spring
        setHeight(getHeight() + getGrowPerSeason());
        System.out.printf("%s has grown in Spring %d\n",getDisplayName(),getHeight());
    }

    public abstract void doSummer();

    public abstract void doAutumn();


    public void doWinter(){
        System.out.printf("%s is not growing in Winter. %d\n",getDisplayName(),getHeight());
    }
}
