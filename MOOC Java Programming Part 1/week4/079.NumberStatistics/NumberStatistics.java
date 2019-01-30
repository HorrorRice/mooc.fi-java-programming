
public class NumberStatistics {

    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        amountOfNumbers = 0;
    }

    public void addNumber(int number) {
        if (number != -1) {
            sum += number;
        }
        amountOfNumbers++;
    }

    public int amountOfNumbers() {
        return amountOfNumbers;
    }

    public int sum() {

        return sum;

    }

    public double average() {
        double sum = 0.0;
        if (this.amountOfNumbers > 0) {
            sum = (double) this.sum / (double) this.amountOfNumbers;
            return sum;
        } else {
            return 0;
        }
    }
}
