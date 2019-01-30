
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account mattAccount = new Account("Matt's account", 1000.00);
        Account myAccount = new Account("My account", 0);
        
        System.out.println("Initial state: ");
        System.out.println(mattAccount);
        System.out.println(myAccount);
        
        mattAccount.withdrawal(100.0);
        System.out.println(mattAccount);    
        myAccount.deposit(100.0);
        System.out.println(myAccount);
    }

}
