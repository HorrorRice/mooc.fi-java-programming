
import java.util.Calendar;

public class Person {

    private String name;
    private MyDate birthday;

    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new MyDate(day, month, year);

    }
    
    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    public Person(String name){
        this.name = name;
        this.birthday = new MyDate(Calendar.getInstance().get(Calendar.DATE),
                Calendar.getInstance().get(Calendar.MONTH ) + 1,
                Calendar.getInstance().get(Calendar.YEAR));

    }

    public int age() {
        int date = Calendar.getInstance().get(Calendar.DATE);
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        MyDate todaysDate = new MyDate(date, month, year);

        return this.birthday.differenceInYears(todaysDate);
    }

    public boolean olderThan(Person compared) {
        if (this.birthday.earlier(compared.birthday)) {
            return true;
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", born " + this.birthday;
    }

}
