public class MyConstantsClass implements OurConstants {
    public static void main(String[] args) {
        int[] numbers = new int[MAX];

        for (int i = MIN; i < 11; i++) {
            if (i > MAX) System.out.println(error);
            else {
                numbers[i] = i;
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
