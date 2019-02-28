
public class Main {

    public static void main(String[] args) throws Exception {
        // write some test code here
        Printer p = new Printer("src/textfile.txt");

        p.printLinesWhichContain("Väinämöinen");
        System.out.println("-----");
        p.printLinesWhichContain("Frank Zappa");
        System.out.println("-----");
        p.printLinesWhichContain("");
        System.out.println("-----");
        
        p.printAll();
    }
}
