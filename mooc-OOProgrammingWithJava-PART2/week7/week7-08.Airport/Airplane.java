
import java.util.HashMap;
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
public class Airplane {

    private String airplaneId;
    private int airplaneCaps;

    public Airplane(String airplaneId, int airplaneCaps) {
        this.airplaneId = airplaneId;
        this.airplaneCaps = airplaneCaps;

    }

    public String getId() {
        return this.airplaneId;
    }

    public int getCapacity() {
        return this.airplaneCaps;
    }

    public String toString() {
        return this.airplaneId + " (" + this.airplaneCaps + " ppl)";
    }

}
