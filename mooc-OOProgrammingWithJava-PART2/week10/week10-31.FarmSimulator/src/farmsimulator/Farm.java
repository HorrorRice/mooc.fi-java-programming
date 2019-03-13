/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rifqi
 */
public class Farm implements Alive {

    private final String owner;
    private final List<Cow> cowsList = new ArrayList<Cow>();
    private final Barn barn;

    public Farm(String owner, Barn barn) {

        this.owner = owner;
        this.barn = barn;

    }

    public String getOwner() {

        return owner;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {

        barn.installMilkingRobot(milkingRobot);
    }

    public void addCow(Cow cow) {
        cowsList.add(cow);
    }

    public String getCows() {

        String buffer = "";
        for (Cow c : cowsList) {
            buffer += "        " + c;
            buffer += "\n";
        }
        
        return buffer;
    }

    public void manageCows() {

        barn.takeCareOf(cowsList);
    }

    @Override
    public void liveHour() {
        for (Cow c : cowsList) {
            c.liveHour();
        }
    }

    public String toString() {

        return "Farm owner: " + owner
                + "\nBarn bulk tank: " + barn.toString()
                + "\nAnimals: \n"
                + getCows();
    }

}
