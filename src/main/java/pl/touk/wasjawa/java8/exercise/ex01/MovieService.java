package pl.touk.wasjawa.java8.exercise.ex01;

import pl.touk.wasjawa.java8.exercise.common.CountryCode;
import pl.touk.wasjawa.java8.exercise.common.movies.Actor;
import pl.touk.wasjawa.java8.exercise.common.movies.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieService {

    public List<String> polishActorNames(Movie movie) {
        List<String> polishActorNames = new ArrayList<>();
        for (Actor actor : movie.getActors()) {
            if (actor.getCountryOfBirth() == CountryCode.PL) {
                polishActorNames.add(actor.getName());
            }
        }
        return polishActorNames;
    }

}
