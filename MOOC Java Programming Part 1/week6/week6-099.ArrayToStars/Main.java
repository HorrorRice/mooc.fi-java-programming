
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {

//         for (int i = 0; i < array.length; i++) {
//            int numberOfStars = array[i];
// 
//            for (int j = 0; j < numberOfStars; j++) {
//                System.out.print("*");
//            }
// 
//            System.out.println();
//        }
        for (int each : array) {
            printStars(each);
            System.out.println();
        }

    }

    public static void printStars(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }
    }

}
