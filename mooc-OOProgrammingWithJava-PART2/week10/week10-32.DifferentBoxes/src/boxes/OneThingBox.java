/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

/**
 *
 * @author Rifqi
 */
public class OneThingBox extends Box {

    private Thing t;

    @Override
    public void add(Thing thing) {
        if (this.t == null) {
            t = thing;
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        
        return this.t != null && this.t.equals(t);

    }

}
