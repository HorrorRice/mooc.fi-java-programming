
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryNumbers() {
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        // Write the number drawing here using the method containsNumber()
        this.numbers = new ArrayList<Integer>();
        int buffer;
        
        for (int i = 0; numbers.size() < 7; i++) {
            buffer = random.nextInt(39) +1;
            if (!containsNumber(buffer)) {
                numbers.add(buffer);
            }
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if (numbers.contains(number)) {
            return true;
        } else {
            return false;
        }

    }
}
