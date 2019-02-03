
public class Grade {

    private int[] gradesArray;

    public Grade() {
        this.gradesArray = new int[6];

    }

    public int Scores(int score) {
        if (score < 30) {
            return 0;
        } else if (score < 35) {
            return 1;
        } else if (score < 40) {
            return 2;
        } else if (score < 45) {
            return 3;
        } else if (score < 50) {
            return 4;
        }
        return 5;
    }

    public void add(int score) {
        if (score < 0 || score > 60) {
            return;
        }
        int grade = Scores(score);
        gradesArray[grade]++;

    }

    public void print() {
        System.out.println("Grade Distribution: ");

        for (int i = gradesArray.length - 1; i >= 0; i--) {
            System.out.println(i + ":" + printStars(gradesArray[i]));
        }

        System.out.println("Acceptance Percentage: " + percentage());
    }

    public double percentage() {
        double total = 0;
        double failed = gradesArray[0];
        for (int grade : gradesArray) {
            total += grade;
        }
        return 100 * (total - failed) / total;
    }

    public String printStars(int amount) {
        String buffer = "";
        for (int i = 0; i < amount; i++) {
            buffer += "*";
        }
        return buffer;
    }
}
