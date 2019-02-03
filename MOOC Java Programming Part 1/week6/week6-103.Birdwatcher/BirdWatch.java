
import java.util.ArrayList;

public class BirdWatch {

    private ArrayList<Bird> birdList;

    public BirdWatch() {
        this.birdList = new ArrayList<Bird>();
    }

    public void add(Bird bird) {
        birdList.add(bird);
    }

    public boolean observation(String name) {
        for (Bird each : birdList) {
            if (Ignore.Case(each.getName(), name)) {
                each.observe();
               return true;

            }

        }
        System.out.println("This is not a bird!");
        return false;
    }

    public void show(String bird) {
        for (Bird each : birdList) {
            if (Ignore.Case(each.getName(), bird)) {
                System.out.println(each);
            }
        }
    }

    public void statistics() {
        for (Bird each : birdList) {
            System.out.println(each);
        }
    }
}
