
public class Bird {

    private String name, latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }

    @Override
    public String toString() {
        return latinName + " (" + ringingYear + ") ";
    }

    @Override
    public int hashCode() {
        if (latinName == null) {
            return 7;
        }

        return ringingYear + latinName.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || latinName == null) {
            return false;
        }
        
        final Bird other = (Bird) obj;

        return latinName.equals(other.latinName) && ringingYear == other.ringingYear;
    }

}
