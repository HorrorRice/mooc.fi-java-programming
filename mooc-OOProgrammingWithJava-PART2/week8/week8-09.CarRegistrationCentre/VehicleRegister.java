
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
public class VehicleRegister {

    private HashMap<RegistrationPlate, String> regDatabase;

    public VehicleRegister() {
        regDatabase = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (regDatabase.containsKey(plate)) {
            return false;
        }
        regDatabase.put(plate, owner);
        return true;

    }

    public String get(RegistrationPlate plate) {
        if (regDatabase.containsKey(plate)) {
            return regDatabase.get(plate);
        }
        return null;
    }

    public boolean delete(RegistrationPlate plate) {
        if (regDatabase.containsKey(plate)) {
            regDatabase.remove(plate); // remove plate.
            return true;
        }
        return false;
    }

    public void printRegistrationPlates() {

        for (RegistrationPlate each : regDatabase.keySet()) {
            System.out.println(each); // print all plates.
        }

    }

    public void printOwners() {
        ArrayList<String> ownerList = new ArrayList<String>(); // helper ArrayList to contain a new owner's.
        for (RegistrationPlate eachOwner : regDatabase.keySet()) { // loop through regDatabase plates

            String each = regDatabase.get(eachOwner); // get plates from owners
            if (!ownerList.contains(each)) { // check if there are no owner with the same name
                ownerList.add(each);    // add owner, but not owner with the same name to ArrayList.
                System.out.println(each);   // print owners.
            }

        }
    }

}
