/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.comparator.FilmComparator;
import reference.comparator.PersonComparator;
import reference.domain.*;

/**
 *
 * @author Rifqi
 */
public class Reference {

    private RatingRegister register;

    public Reference(RatingRegister register) {

        this.register = register;

    }

    public Film recommendFilm(Person person) {

        if (this.register.getPersonalRatings(person).isEmpty()) {

            List<Film> films = new ArrayList<Film>(register.filmRatings().keySet());
            Collections.sort(films, new FilmComparator(register.filmRatings()));
            return films.get(0);

        }

        List<Person> personsSortedBySuitability = personsSortBySuitability(person);
        return getSuitableFilm(person, personsSortedBySuitability);

    }

    private Film getSuitableFilm(Person forPerson, List<Person> personsSortedBySuitability) {

        Map<Film, Rating> personalRatings = this.register.getPersonalRatings(forPerson);

        for (Person person : personsSortedBySuitability) {
            if (person == forPerson) {
                continue;

            }

            Map<Film, Rating> suitableRatings = register.getPersonalRatings(person);
            for (Film film : suitableRatings.keySet()) {
                Rating rating = suitableRatings.get(film);
                if (personalRatings.containsKey(film)) {
                    continue;

                }

                if (rating.equals(Rating.GOOD) || rating.equals(Rating.FINE)) {
                    return film;

                }

            }

        }

        return null;

    }

    private List<Person> personsSortBySuitability(Person person) {

        Map<Film, Rating> filmRatings = register.getPersonalRatings(person);
        Map<Person, Integer> personSuitability = personSuitability(filmRatings);
        List<Person> people = new ArrayList<Person>(personSuitability.keySet());
        Collections.sort(people, new PersonComparator(personSuitability));

        return people;

    }

    private Map<Person, Integer> personSuitability(Map<Film, Rating> filmRatings) {

        Map<Person, Integer> personSuitability = new HashMap<Person, Integer>();

        for (Person reviewer : this.register.reviewers()) {

            int equality = 0;

            for (Film film : filmRatings.keySet()) {

                Rating personRating = filmRatings.get(film);
                Rating comparedRating = this.register.getRating(reviewer, film);
                equality += ratingsSuitability(personRating, comparedRating);

            }

            personSuitability.put(reviewer, equality);

        }

        return personSuitability;

    }

    private int ratingsSuitability(Rating personRating, Rating otherRating) {

        return personRating.getValue() * otherRating.getValue();

    }

}
