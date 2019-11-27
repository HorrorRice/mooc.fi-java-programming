
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {

        int newEuros = this.euros + added.euros;
        int newCents = this.cents + added.cents;
        Money newObject = new Money(newEuros, newCents);
        return newObject;
    }

    public boolean less(Money compared) {

        if (this.euros > compared.euros) {
            return false;
        } else if (this.euros == compared.euros && this.cents > compared.cents) {
            return false;
        } else {
            return true;
        }
    }

    public Money minus(Money decremented) {

        int newEuros = this.euros - decremented.euros;
        int newCents = this.cents - decremented.cents;

        if (newEuros < 0 && newCents < 0) {
            newEuros = 0;
            newCents = 0;
        } else if (newEuros < 0) {
            newEuros = 0;
            newCents = 0;
        } else if (newCents < 0) {
            newCents += 100;
            newEuros--;
        }

        Money newObject = new Money(newEuros, newCents);
        return newObject;

    }

}
