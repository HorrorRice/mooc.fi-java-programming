
import java.util.Arrays;

public class Main {

    public static int[] copy(int[] array) {

        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        return newArray;
    }

    public static int[] reverseCopy(int[] array) {
        
        int[] reversed = new int[array.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = array[array.length - 1 - i];
   
        }
        return reversed;
    }

    public static void main(String[] args) {

        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(reverse));

    }

}
