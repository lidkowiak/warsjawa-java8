package pl.touk.wasjawa.java8.exercise.ex08.answer;

import pl.touk.wasjawa.java8.exercise.common.movies.Actor;
import pl.touk.wasjawa.java8.exercise.common.movies.Movie;
import pl.touk.wasjawa.java8.exercise.ex08.LoggerMode;

import java.util.List;
import java.util.stream.Collectors;

public class MovieService {

    private final static StupidLogger LOGGER = new StupidLogger(LoggerMode.DEBUG);

    public List<String> actorsToActorsNames(Movie movie) {
        return movie.getActors().stream()
                .map(Actor::getName)
                .peek(actor -> LOGGER.debug(() -> "Find actor" + actor))
                .collect(Collectors.toList());
    }

}
