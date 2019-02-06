import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Grade gradeDistribution = new Grade();

        System.out.println("Type exam scores, -1 completes: ");
        int score = input.nextInt();

        while (score != -1){
            gradeDistribution.add(score);
            score = input.nextInt();
        }

        gradeDistribution.print();

    }
}