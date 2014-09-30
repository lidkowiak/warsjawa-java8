package pl.touk.wasjawa.java8.exercise.ex06;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import pl.touk.wasjawa.java8.exercise.common.CountryCode;
import pl.touk.wasjawa.java8.exercise.common.movies.Movie;
import pl.touk.wasjawa.java8.exercise.common.movies.MovieFactory;
import pl.touk.wasjawa.java8.exercise.ex06.answer.MovieService;

public class MovieServiceTest {

    private final MovieService movieService = new MovieService();

    @Test
    public void shouldGroupActorByCountry() {
        //given
        Movie movie = MovieFactory.childrenOfMen();

        //when
        Map<CountryCode, List<String>> actorsFromCountries = movieService.actorsNamesGroupByCountries(movie);

        //then
        Assert.assertEquals(3, actorsFromCountries.size());
        Assert.assertEquals(1, actorsFromCountries.get(CountryCode.US).size());
        Assert.assertEquals(2, actorsFromCountries.get(CountryCode.GB).size());
        Assert.assertEquals(1, actorsFromCountries.get(CountryCode.PL).size());
        Assert.assertEquals("Jacek Koman", actorsFromCountries.get(CountryCode.PL).get(0));
    }

}