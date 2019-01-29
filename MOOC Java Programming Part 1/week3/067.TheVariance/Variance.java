
import java.util.ArrayList;

public class Variance {

    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int getList = 0;
        for (int i : list) {
            getList += i;
        }
        return getList;
    }

    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double average = (double) sum(list);
        return average / list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        double buffer = 0.0; // 17
        double average = average(list);
        for (int i : list) {
           buffer = buffer + Math.pow((average - i), 2); // == (3.5 - 3)^2 + (3.5 - 2)^2 + (3.5 - 7)^2 + (3.5 - 2)^2  
        }
        double result = buffer / (list.size() - 1); // Array List Size (4 array number - 1) (4-1)
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }

}
