package pl.touk.wasjawa.java8.exercise.ex08;

import org.junit.Assert;
import org.junit.Test;
import pl.touk.wasjawa.java8.exercise.common.movies.Movie;
import pl.touk.wasjawa.java8.exercise.common.movies.MovieFactory;

import java.util.List;

public class MovieServiceTest {

    private MovieService movieService = new MovieService();

    @Test
    public void shouldConvertActorListToActorNameList() {
        //given
        Movie movie = MovieFactory.americanBeauty();

        //when
        List<String> actorsNames = movieService.actorsToActorsNames(movie);

        //then
        Assert.assertEquals(movie.getActors().size(), actorsNames.size());
        Assert.assertEquals("Kevin Spacey", actorsNames.get(0));
    }

}