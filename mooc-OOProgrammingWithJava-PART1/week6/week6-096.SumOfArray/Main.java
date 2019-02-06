
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 4, 3, 2, 1};
        System.out.println(sum(array));
    }

    public static int sum(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
}
