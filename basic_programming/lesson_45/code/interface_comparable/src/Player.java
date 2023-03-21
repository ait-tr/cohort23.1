public class Player implements Comparable<Player> {

    private int ranking;
    private String name;
    private int age;

    public Player(int ranking, String name, int age) {
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //sort according to ranking.  Реализация метода compareTo  для сортировки по рангу
   /* public int compareTo(Player p){
        if(getRanking() - p.getRanking()>0){
            return 1;
        }else if (getRanking() - p.getRanking()<0){
            return -1;
        }else return 0;

    }*/
 //   public int compareTo(Player p){
 //       return getRanking() - p.getRanking();
 //   }

 //   public int compareTo(Player p){
//        return Integer.compare(getRanking(),p.getRanking());
//    }

    public int compareTo(Player p){
        int playerName = getName().compareTo(p.getName());
        return playerName == 0 ? Integer.compare(getAge(),p.getAge()) : playerName;
    }

    @Override
    public String toString() {
        return "Player{" +
                "ranking=" + ranking +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
