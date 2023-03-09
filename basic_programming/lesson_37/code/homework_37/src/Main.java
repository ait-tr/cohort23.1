public class Main {
    public static void main(String[] args) {
        Voter voter1 = new Voter("John","Berlin",25);
        voter1.setAge(35);
        voter1.setAge(15);
        System.out.println(voter1.getName());
        System.out.println(voter1.getAge());

        /*
too young to vote
John
35
         */
    }
}
