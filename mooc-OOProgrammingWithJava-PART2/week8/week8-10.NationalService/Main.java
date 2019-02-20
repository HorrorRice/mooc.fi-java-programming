
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        CivilService person = new CivilService();
        
        System.out.println("National Services: ");
        for (int i = 0; i < 365; i++) {
            person.work();
        }
        System.out.println("Civil Service: " + person.getDaysLeft() + " days left.");

        MilitaryService militaryPerson = new MilitaryService(400);
        for (int i = 0; i < 300; i++) {
            militaryPerson.work();

        }
        System.out.println("Military Service: " + militaryPerson.getDaysLeft() + " days left.");
    }
}
