
import java.util.ArrayList;
import java.util.Collections;

public class SmartCombining {

    public static void smartCombine(ArrayList<Integer> list1, ArrayList<Integer> list2) {

//        for (int i = 0; i < list2.size(); i++) {
//            int num = list2.get(i);
//
//            if (!list1.contains(num)) {
//                list1.add(num);
//            }
//        }
        for (Integer number : list2) {
            if (!list1.contains(number)) {
                list1.add(number);
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 5, 1, 2);

        Collections.addAll(list2, 5, 1, 2, 1, 40);

        // remove comment when method ready
        smartCombine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
    }

}
