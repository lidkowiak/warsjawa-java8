package pl.touk.wasjawa.java8.exercise.ex05;

import org.junit.Assert;
import org.junit.Test;
import pl.touk.wasjawa.java8.exercise.common.movies.Movie;
import pl.touk.wasjawa.java8.exercise.common.movies.MovieFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieServiceTest {

    private MovieService movieService = new MovieService();

    @Test
    public void shouldCalculateMovieStats() {
        //given
        List<Movie> movies = new ArrayList<>();
        movies.add(MovieFactory.americanBeauty());
        movies.add(MovieFactory.childrenOfMen());
        movies.add(MovieFactory.goldenEye());

        //when
        MoviesReleaseYearStatistics statistics = movieService.calculateMoviesStats(movies);

        //then
        Assert.assertEquals(1995, statistics.getOldestMovieYear());
        Assert.assertEquals(2000, statistics.getAverageReleaseYear(), 0.001);
        Assert.assertEquals(2006, statistics.getNewestMovieYear());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnEmptyMovieList() {
        //given
        List<Movie> movies = Collections.emptyList();

        //when
        MoviesReleaseYearStatistics statistics = movieService.calculateMoviesStats(movies);

        //then except exception
    }

}