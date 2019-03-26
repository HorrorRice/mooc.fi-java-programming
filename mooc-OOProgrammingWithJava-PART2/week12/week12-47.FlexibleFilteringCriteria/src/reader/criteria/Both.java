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
public class Both implements Criterion {

    private Criterion firstCriteria, secondCriteria;

    public Both(Criterion one, Criterion two) {
        this.firstCriteria = one;
        this.secondCriteria = two;
    }

    @Override
    public boolean complies(String line) {
        return (firstCriteria.complies(line) && secondCriteria.complies(line));
    }

}
