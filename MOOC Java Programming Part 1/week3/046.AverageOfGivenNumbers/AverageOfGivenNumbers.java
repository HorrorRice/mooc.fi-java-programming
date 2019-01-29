
public class AverageOfGivenNumbers {
    
    // implement here again the method of exercise 43
    public static int sum(int number1, int number2, int number3, int number4) {
        return number1 + number2 + number3 + number4;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        return sum(number1, number2, number3, number4) / (double)4 ;
    }
    
//    Add the numbers: 4 + 3 + 6, 1 = 14
//    Divide by how many numbers (there are 4 numbers): 14 / 3 = 3.5

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
