
public class RegistrationPlate {

    // the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }

    @Override
    public boolean equals(Object obj) { // object type of 'Object' and variable 'obj' (Object obj)
        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        // WantedType variable = (WantedType) oldVariable;
        RegistrationPlate compared = (RegistrationPlate) obj; // changing object type of 'Object' to 'RegistrationPlate'
                                                              // and variable of 'obj' to 'compared' 

        if (this.regCode == null || !this.regCode.equals(compared.regCode)) {
            return false;
        }
        return !(this.country == null || !this.country.equals(compared.country));
    }

    @Override
    public int hashCode() {
        if (this.regCode == null) {
            return 7; // number is casually picked.
        }

        return this.country.hashCode() + this.regCode.hashCode();
    }

}
