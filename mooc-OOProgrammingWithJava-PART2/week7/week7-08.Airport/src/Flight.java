
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rifqi
 */
public class Flight {

    private Airplane plane;
    private String departureId;
    private String destinationId;

    public Flight(Airplane plane, String departureId, String destinationId) {
        this.plane = plane;
        this.departureId = departureId;
        this.destinationId = destinationId;
    }

    public Airplane getAirplane() {
        return this.plane;
    }

    public String getDepartureId() {
        return this.departureId;
    }

    public String getDestinationId() {
        return this.destinationId;
    }

    public String toString() {
        return this.plane.toString() + "(" + this.departureId + "-" + this.destinationId + ")"; // convert Airplane Object(ID, Capacity) to String
                                                                                                // and print it with departureId + destinationId
                                                                                                // (planeId (planeCapacity ppl) (departure - destination)
    }
}
