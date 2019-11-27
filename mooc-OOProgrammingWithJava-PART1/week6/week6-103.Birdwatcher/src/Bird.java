/**
 *
 * @author Rifqi
 */
public class Bird {

    private String name;
    private String latinName;
    private int observed;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observed = 0;
    }

    public void observe() {
        observed++;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " (" + latinName + "): " + observed + " observations";
    }
}
