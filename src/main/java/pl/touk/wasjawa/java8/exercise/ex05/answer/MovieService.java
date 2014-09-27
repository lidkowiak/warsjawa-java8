package pl.touk.wasjawa.java8.exercise.ex05.answer;

import pl.touk.wasjawa.java8.exercise.common.movies.Movie;
import pl.touk.wasjawa.java8.exercise.ex05.MoviesReleaseYearStatistics;

import java.util.IntSummaryStatistics;
import java.util.List;

public class MovieService {

    public MoviesReleaseYearStatistics calculateMoviesStats(List<Movie> movies) {
        if (movies.isEmpty()) {
            throw new IllegalArgumentException("Empty movies list");
        }
        IntSummaryStatistics statistics = movies.stream()
                .mapToInt(movie -> movie.getReleaseYear())
                .summaryStatistics();
        return new MoviesReleaseYearStatistics(statistics.getMin(), statistics.getMax(), statistics.getAverage());
    }

}
