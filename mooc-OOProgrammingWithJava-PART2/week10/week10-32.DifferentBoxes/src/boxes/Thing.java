package boxes;

public class Thing  {

    private String name;
    private int weight;

    public Thing(String name, int weight) {

        if (weight < 0) {
            throw new IllegalArgumentException("weight should not be negative");
        }

        this.name = name;
        this.weight = weight;
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
     
        final Thing other = (Thing) obj;
        return !((this.name == null) ? (other.name != null) : !this.name.equals(other.name));
    }


    public int getWeight() {
        return weight;
    }


}
