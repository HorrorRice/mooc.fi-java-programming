/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.*;

/**
 *
 * @author Rifqi
 */
public class RatingRegister {

    public Map<Film, List<Rating>> films;
    public Map<Person, Map<Film, Rating>> reviewers;

    public RatingRegister() {
        this.films = new HashMap<Film, List<Rating>>();
        this.reviewers = new HashMap<Person, Map<Film, Rating>>();
    }

    public void addRating(Film film, Rating rating) {
        if (!films.keySet().contains(film)) {
            films.put(film, new ArrayList<Rating>());
        }

        films.get(film).add(rating);
    }

    public void addRating(Person person, Film film, Rating rating) {
        if (!reviewers.keySet().contains(person)) {
            reviewers.put(person, new HashMap<Film, Rating>());
        }        
        if (!reviewers.get(person).containsKey(film)) {
            reviewers.get(person).put(film, rating);
            addRating(film, rating);
        }
    }

    public List<Rating> getRatings(Film film) {
        return films.get(film);
    }

    public Rating getRating(Person person, Film film) {

        if (reviewers.get(person).containsKey(film)) {
            return reviewers.get(person).get(film);

        }
        return Rating.NOT_WATCHED;

    }

    public Map<Film, List<Rating>> filmRatings() {
        return films;
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {
        if (!reviewers.containsKey(person)) {
            reviewers.put(person, new HashMap<Film, Rating>());
        }
        return reviewers.get(person);

    }

    public List<Person> reviewers() {
        return new ArrayList<Person>(reviewers.keySet());
    }
}
