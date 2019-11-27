
import java.util.ArrayList;
import java.util.Scanner;

// This is not an exercise but a "sandbox" where you can freely test
// whatever you want
public class Application {

            public static void print(ArrayList<String> list) {
    for (String word : list) {
        System.out.println( word );
    }
}
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
// 14.2 Return values ----------------------------------------------------------
//        System.out.print("Enter first number: ");
//        int a = reader.nextInt();
//
//        System.out.print("Enter second number: ");
//        int b = reader.nextInt();
//
//        System.out.println("Sum is " + sum(a, b));

//        int first = 3;
//        int second = 2;
//
//        sum(sum(1, 2), sum(first, second));
// 1) the inner methods are executed:
//    sum(1, 2) = 3   and sum(first, second) = 5
// 2) the outer method is executed:
//   sum(3, 5) = 8

    ArrayList<String> list = new ArrayList<String>();
    list.add("Java");
    list.add("Python");
    list.add("Ruby");
    list.add("C++");

    print(list);
}

    

// 14.2 Return values ---------------------------------------------------------- 
//     public static int sum(int first, int second) {
//        
//        return first + second;
}

// 14.3 The method's own variables
//      public static double average(int number1, int number2, int number3) {
//
//        int sum = number1 + number2 + number3;
//        double average = sum / 3.0;
//        return average;
//    }

