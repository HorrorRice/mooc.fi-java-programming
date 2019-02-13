
public class Main {

    public static void main(String[] args) {

        System.out.println("---SUITCASE DEBUG---");
        Suitcase sTest1 = new Suitcase(10);
        System.out.println(sTest1);

        Suitcase sTest2 = new Suitcase(10);
        Thing sThing1 = new Thing("Water Bottle", 10);
        sTest2.addThing(sThing1);
        System.out.println(sTest2);
        
        

        System.out.println("---CONTAINER DEBUG---");      
        Container cTest = new Container(10);
        System.out.println(cTest);

        cTest.addSuitcase(sTest1);
        System.out.println(cTest);

        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);

    }

    public static void addSuitcasesFullOfBricks(Container container) {
        for (int i = 0; i < 100; i++) {
            Suitcase suitcase = new Suitcase(100);
            Thing brick = new Thing("Brick", i + 1);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
        }
    }

}
