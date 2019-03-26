/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author Rifqi
 */
public class AtLeastOne implements Criterion {

    private final Criterion[] criterion;

    public AtLeastOne(Criterion... criterion) {
        this.criterion = criterion;
    }

    @Override
    public boolean complies(String line) {
        for (Criterion criteria : criterion) {
            if (criteria.complies(line)) {
                return true;
            }
        }
        return false;
    }

}
