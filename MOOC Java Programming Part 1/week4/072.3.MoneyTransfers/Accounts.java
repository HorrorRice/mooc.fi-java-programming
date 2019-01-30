import java.util.Scanner;
public class Accounts {

    public static void transfer(Account from, Account to, double amount) {
        System.out.println("-------------");
        
        System.out.println("Initial balance: ");
        System.out.println(from);
        from.withdrawal(amount);
        System.out.println(to);
        to.deposit(amount);

        System.out.println("------Transfer------");

        System.out.println("Final balance: ");
        System.out.println(from);
        System.out.println(to);
        
        System.out.println("-------------");
    }

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Scanner reader = new Scanner(System.in);
        
        Account A = new Account("A's account", 100.0);
        Account B = new Account("B's account", 0.0);
        Account C = new Account("C's account", 0.0);


        transfer(A, B, 50.0);
        transfer(B, C, 25.0);
    }

}
