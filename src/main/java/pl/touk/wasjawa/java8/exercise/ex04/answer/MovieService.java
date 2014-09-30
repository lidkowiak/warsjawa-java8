package pl.touk.wasjawa.java8.exercise.ex04.answer;

import java.util.List;
import java.util.stream.Collectors;

import pl.touk.wasjawa.java8.exercise.common.CountryCode;
import pl.touk.wasjawa.java8.exercise.common.movies.Actor;
import pl.touk.wasjawa.java8.exercise.common.movies.Movie;

public class MovieService {

    public static final int NEW_MOVIE_YEAR_LIMIT = 2000;

    public List<String> polishActorNamesInNewMovies(List<Movie> movies) {
        return movies.stream()
                .filter(movie -> movie.getReleaseYear() > NEW_MOVIE_YEAR_LIMIT)
                .flatMap(movie -> movie.getActors().stream())
                .filter(actor -> CountryCode.PL.equals(actor.getCountryOfBirth()))
                .map(Actor::getName)
                .collect(Collectors.toList());
    }

}
