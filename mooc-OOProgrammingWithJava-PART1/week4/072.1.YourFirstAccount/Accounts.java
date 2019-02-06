
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account rifqiAccount = new Account("Rifqi's account", 100.00);
        
        System.out.println("Initial state: ");
        System.out.println(rifqiAccount);
        
        rifqiAccount.deposit(20);

        System.out.println("Final state: ");
        System.out.println(rifqiAccount);
    }

}
