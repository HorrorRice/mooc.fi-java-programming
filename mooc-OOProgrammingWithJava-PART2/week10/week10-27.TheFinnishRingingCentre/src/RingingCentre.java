
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rifqi
 */
public class RingingCentre {

    private Map<Bird, List<String>> birds;

    public RingingCentre() {

        birds = new HashMap<Bird, List<String>>();

    }

    public void observe(Bird bird, String place) {

        if (!birds.containsKey(bird)) {
            birds.put(bird, new ArrayList<String>());

        }

        birds.get(bird).add(place);

    }

    public void observations(Bird bird) {

        if (!birds.containsKey(bird)) {
            System.out.println(bird.toString() + "observations: " + 0);
            return;

        }

        System.out.println(bird.toString() + "observations: " + birds.get(bird).size());
        for (String e : birds.get(bird)) {
            System.out.println(e);
        }
    }

}
