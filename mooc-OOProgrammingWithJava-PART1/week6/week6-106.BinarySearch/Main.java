
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] array = {-3, 2, 3, 4, 7, 8, 12};
        Scanner reader = new Scanner(System.in);

        System.out.print("Numbers in the array " + Arrays.toString(array));
        System.out.println();

        System.out.print("Enter searched number: ");
        String etsittavaLuku = reader.nextLine();
        System.out.println();

        boolean result = BinarySearch.search(array, Integer.parseInt(etsittavaLuku));

        System.out.println(result);
    }
}
