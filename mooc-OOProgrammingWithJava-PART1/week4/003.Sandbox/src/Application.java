
import java.util.Scanner;

// This is not an exercise but a "sandbox" where you can freely test
// whatever you want
public class Application {

    public static void main(String[] args) {
        Person pekka = new Person("Pekka", 0);
        Person andrew = new Person("Andrew", 0);

        pekka.printPerson();
        andrew.printPerson();

        System.out.println("");

        pekka.becomeOlder();
        pekka.becomeOlder();

        pekka.printPerson();
        andrew.printPerson();
    }
}
