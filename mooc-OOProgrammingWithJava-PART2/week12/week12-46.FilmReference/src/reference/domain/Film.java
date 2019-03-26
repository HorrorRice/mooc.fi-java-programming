/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.domain;

/**
 *
 * @author Rifqi
 */
public class Film {

    private final String NAME;

    public Film(String NAME) {
        this.NAME = NAME;
    }

    public String getName() {
        return NAME;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.NAME != null ? this.NAME.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        final Film other = (Film) obj;
        return !((this.NAME == null) ? (other.NAME != null) : !this.NAME.equals(other.NAME));
    }

    @Override
    public String toString() {
        return NAME;
    }

}
