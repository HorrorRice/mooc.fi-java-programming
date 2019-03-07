/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Rifqi
 */
public class ContainerHistory {

    private List<Double> history;

    public ContainerHistory() {

        this.history = new ArrayList<Double>();

    }

    public void add(double situation) {

        history.add(situation);
    }

    public void reset() {

        history.clear();
    }

    @Override
    public String toString() {

        return history.toString();
    }

    public double maxValue() {
        
        double max = history.get(0);
        for(Double each : history) {
            if( each > max) {
                max = each;
            }
        }
        
        return max;
        
//        return Collections.max(history); // short way to find max value
    }

    public double minValue() {
        
        double min = history.get(0);
        for (Double each : history) {
            if (each < min) {
                min = each;
            }
        }
        return min;
//     return Collections.min(history); // short way to find min value
    }

    public double average() {

        double average = 0;
        for (Double each : history) {
            average += each;

        }

        return average / history.size();
    }

    public double greatestFluctuation() {

        if (history.isEmpty() || history.size() == 1) {
            return 0;
        }

        double max = 0;
        for (int i = 0; i < history.size() - 1; i++) {
            double temp = Math.abs(history.get(i) - history.get(i + 1));
            if (temp > max) {
                max = temp;
            }
        }

        return max;
    }

    public double variance() {
        
        double sum = 0;
        for (double each : history) {
            sum += (each - average()) * (each - average());
        }

        return sum / (history.size() - 1);
    }

}
