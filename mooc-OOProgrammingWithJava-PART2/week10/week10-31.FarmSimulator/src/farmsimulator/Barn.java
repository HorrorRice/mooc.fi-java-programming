/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;

/**
 *
 * @author Rifqi
 */
public class Barn {

    private final BulkTank tank;
    private MilkingRobot milkingRobot;

    public Barn(BulkTank tank) {

        this.tank = tank;

    }

    public BulkTank getBulkTank() {

        return tank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {

        this.milkingRobot = milkingRobot;
        milkingRobot.setBulkTank(tank);
    }

    public void takeCareOf(Cow cow) {

        if (milkingRobot == null) {
            throw new IllegalStateException("MilkingRobot hasn't been installed");
        }

        milkingRobot.milk(cow);

    }

    public void takeCareOf(Collection<Cow> cows) {

        if (milkingRobot == null) {
            throw new IllegalStateException("MilkingRobot hasn't been installed");
        }

        for (Cow cow : cows) {
            milkingRobot.milk(cow);
        }

    }

    public String toString() {

        return tank.toString();
    }

}
