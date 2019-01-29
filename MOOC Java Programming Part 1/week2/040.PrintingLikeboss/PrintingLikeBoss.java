
public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int i = 0;
        while (i < amount) {
            i++;
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int i = 1;
        while (i <= size) {
            printWhitespaces(size - i);
            printStars(i);
            i++;
        }

    }

    public static void xmasTree(int height) {
        // 40.3
        int i = 1;
        while (i <= height) {
            i++;
            printWhitespaces(height - i);
            printStars(i + ( i - 1));

        }
        
         printWhitespaces(height - 2);
        printStars(3);
        printWhitespaces(height - 2);
        printStars(3);
        

    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(4);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
