
public class Main {

    public static void main(String[] args) {
        // write testcode here
        Counter a = new Counter(900, false);
        a.decrease(7);
        System.out.println(a.value());  // counter >= decreaseAmount & check is false
        Counter b = new Counter(2, true);
        b.decrease(4);
        System.out.println(b.value());     // counter <= decreaseAmount & check is true
        Counter c = new Counter(2, false);
        c.decrease(5);
        System.out.println(c.value());   // counter <= decreaseAmount & check is false
        Counter d = new Counter(2, false);
        d.decrease();
        System.out.println(d.value());    // counter - 1 & check is false/true  
        Counter e = new Counter(900, false);
        e.decrease();
        System.out.println(e.value());  // counter + 1 & check is false/true
        Counter f = new Counter(900, false);
        f.decrease(-55);
        System.out.println(f.value()); // counter >= decreaseAmount & check is false
        Counter g = new Counter(2, true);
        c.decrease(4);
        System.out.println(g.value()); // counter <= decreaseAmount & check is true
    }
}
//893
//0
//-3
//1
//899
//900
//2

//900
//-2
//2
//1
//899
//900
//2
