
import java.util.ArrayList;
import java.util.List;
import people.Person;
import people.Student;
import people.Teacher;

public class Main {
    
    public static void printDepartment(List<Person> person) {      
        for(Person people : person){
            System.out.println(people);
        }
        
    }

    public static void main(String[] args) {
        
        List<Person> people = new ArrayList<Person>();

        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200) );
        people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki") );

        printDepartment(people);

    }
}
