package pl.touk.wasjawa.java8.exercise.ex06.answer;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.Map;

import pl.touk.wasjawa.java8.exercise.common.CountryCode;
import pl.touk.wasjawa.java8.exercise.common.movies.Actor;
import pl.touk.wasjawa.java8.exercise.common.movies.Movie;

public class MovieService {

    public Map<CountryCode, List<String>> actorsNamesGroupByCountries(Movie movie) {
        return movie.getActors().stream()
                .collect(groupingBy(
                        Actor::getCountryOfBirth,
                        mapping(Actor::getName, toList())
                ));
    }

}
