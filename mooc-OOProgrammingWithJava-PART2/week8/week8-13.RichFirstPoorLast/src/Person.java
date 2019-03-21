
public class Person implements Comparable<Person> {

    private int salary;
    private String name;

    public Person(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " " + salary;
    }

    @Override
    public int compareTo(Person person) {
        if (this.salary == person.getSalary()) {
            return 0;
        } else if (this.salary < person.getSalary()) {
//            return -1; POOR FIRST.
            return 1; // RICH FIRST
        } else {
//            return 1; POOR FIRST
            return -1; // RICH FIRST.
        }

        // return person.getSalary() - this.salary // this method will also work.
        //  return person.salary - this.salary; // this one either.
    }
}
