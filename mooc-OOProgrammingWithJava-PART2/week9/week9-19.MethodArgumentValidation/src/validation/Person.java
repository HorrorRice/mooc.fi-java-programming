package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name must not be empty! or null");
        } else if (name.length() > 40) {
            throw new IllegalArgumentException("Name must not be greater than 40 characters!");
        } if (age > 120 || age < 0) {
            throw new IllegalArgumentException("Age must not be lower than 0, or greater than 120!.");
        }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return this.name + " " + this.age + " years old.";
    }
}
