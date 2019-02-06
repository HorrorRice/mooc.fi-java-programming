
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);

        while (true) {

            System.out.print("name: ");
            String setName = reader.nextLine();
            if (setName.isEmpty()) {
                break;
            }
            System.out.print("studentnumber: ");
            String setStudentNumber = reader.nextLine();

            list.add(new Student(setName, setStudentNumber));
        }

        for (Student i : list) {
            System.out.println(i.toString());
        }

        System.out.println("Give search term: ");
        String search = reader.nextLine();

        System.out.println("Result: ");

        for (Student i : list) {
            if (i.getName().contains(search)) {
                System.out.println(i);
            }
        }
    }
}
