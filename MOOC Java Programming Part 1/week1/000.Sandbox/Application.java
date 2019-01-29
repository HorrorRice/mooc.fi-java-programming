
import java.util.Scanner;

// This is not an exercise but a "sandbox" where you can freely test
// whatever you want
public class Application {

    /* ---- 13.1 Method parameters  ----*/
//    public static void greet(String name) {
//        System.out.println("Hello " + name + ", greetings from the world of methods!");
//    }
    /* ---- 13.2 Many parameters  ----*/
//    public static void greet(String name, String greetingsFrom) {    
//            System.out.println("Hi " + name + ", greetings from " + greetingsFrom);
//    }
    /* ---- 13.3 Method calling another method  ----*/
//    public static void greet(String name) {
//        System.out.println("Hi " + name + ", greetings from the world of methods!");
//    }
//    public static void greetManyTimes(String name, int times) {
//        int i = 0;
//                while (i < times){
//                    greet(name);
//                    i++;
//                }
//    }
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int num = reader.nextInt();
        

        int sum = 1;
        int n = 1;
        while (num >= n) {
            sum*=n;
            n++;

        }

            System.out.println("Factorial is " + sum);

        /* ---- 13.1 Method parameters  ----*/
//        String name1 = "Anne";
//        String name2 = "Green";
//        int age1 = 24;
//        greet( name1 + " " + name2 ); // Empty line is for space
//        greet("John " + age1 + " years");  
//        greet("Rifqi");
//        greet("Arthur");

        /* ---- 13.2 Many parameters  ----*/
//          String name = "Rifqi";
//          String greetingsFrom1 = "Nevada";
//          String gFrom2 = "Alabama";
//          greet(name, greetingsFrom1);
//        /* ---- 13.3 Method calling another method  ----*/
//        greetManyTimes("Anthony", 2);
//        System.out.println("and");
//        greetManyTimes("Arthur", 5);
    }
}
