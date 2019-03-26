/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import reference.domain.*;

/**
 *
 * @author Rifqi
 */
public class FilmComparator implements Comparator<Film> {
    
    private Map<Film, List<Rating>> ratings;
    
    public FilmComparator(Map<Film, List<Rating>> ratings){
        this.ratings = ratings;
    }
    
    private double average(List<Rating> ratings) {
        double sum = 0;
        
        for(Rating e : ratings) {
            sum += e.getValue();
        }
        return sum / ratings.size();
    }

    @Override
    public int compare(Film f1, Film f2) {
        double film = average(ratings.get(f1));
        double other = average(ratings.get(f2));
        return (int) Math.floor(other - film);
    }
    
}
