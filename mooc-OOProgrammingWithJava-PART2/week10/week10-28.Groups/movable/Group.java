/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rifqi
 */
public class Group implements Movable {

    private List<Movable> group;

    public Group() {

        this.group = new ArrayList<Movable>();
    }
    
    
    public void addToGroup(Movable movable) {

        group.add(movable);

    }

    @Override
    public void move(int dx, int dy) {
        
        for (Movable e : group) {
            e.move(dx, dy);

        }
    }
    
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        for (Movable e : this.group) {
            sb.append(e.toString()).append("\n");
        }     
        return sb.toString();
    }

}
