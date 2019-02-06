
public class Main {

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i : array) {
            if (smallest > i) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallestIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int startingIndex) {
        int smallest = array[startingIndex];

        for (int i = startingIndex; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                startingIndex = i;
            }
        }
        return startingIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int swap1 = array[index1];
        int swap2 = array[index2];

        array[index1] = swap2;
        array[index2] = swap1;
    }

    public static void sort(int[] array) {
        print(array);
        for (int from = 0; from < array.length; from++) {
            swap(array, from, indexOfTheSmallestStartingFrom(array, from));
            print(array);
        }
    }

    public static void print(int[] array) {
        System.out.print("[ ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            if (i == array.length - 1) {
                System.out.println("]");

            } else {
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);

    }
}

//        int smallestIndex = startingIndex;
//        for (int i = startingIndex; i < array.length; i++) {
//            if (array[i] < array[smallestIndex]) {
//                smallestIndex = i;
//
//            }
//        }
//        return smallestIndex;
//      }
