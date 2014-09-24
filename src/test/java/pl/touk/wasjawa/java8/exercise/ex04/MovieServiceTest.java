package pl.touk.wasjawa.java8.exercise.ex04;

import org.junit.Test;
import pl.touk.wasjawa.java8.exercise.common.movies.Movie;
import pl.touk.wasjawa.java8.exercise.common.movies.MovieFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MovieServiceTest {

    private final MovieService movieService = new MovieService();

    @Test
    public void shouldFilterPolishActorsNameInMoviesAfter2000() {
        //given
        List<Movie> movies = new ArrayList<>();
        movies.add(MovieFactory.americanBeauty());
        movies.add(MovieFactory.childrenOfMen());
        movies.add(MovieFactory.goldenEye());

        //when
        List<String> polishActorNames = movieService.polishActorNamesInNewMovies(movies);

        //then
        assertEquals(1, polishActorNames.size());
        assertEquals("Jacek Koman", polishActorNames.get(0));
    }

    @Test
    public void shouldNotFilterPolishActorsNameWHENNoMoviesIsGiven() {
        //given
        List<Movie> movies = new ArrayList<>();

        //when
        List<String> polishActorNames = movieService.polishActorNamesInNewMovies(movies);

        //then
        assertEquals(0, polishActorNames.size());
    }
}