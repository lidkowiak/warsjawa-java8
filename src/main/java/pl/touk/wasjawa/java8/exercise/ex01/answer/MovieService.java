package pl.touk.wasjawa.java8.exercise.ex01.answer;

import java.util.List;
import java.util.stream.Collectors;

import pl.touk.wasjawa.java8.exercise.common.CountryCode;
import pl.touk.wasjawa.java8.exercise.common.movies.Actor;
import pl.touk.wasjawa.java8.exercise.common.movies.Movie;

public class MovieService {

    public List<String> polishActorNames(Movie movie) {
        return movie.getActors().stream()
                .filter(actor -> CountryCode.PL.equals(actor.getCountryOfBirth()))
                .map(Actor::getName)
                .collect(Collectors.toList());
    }

}
