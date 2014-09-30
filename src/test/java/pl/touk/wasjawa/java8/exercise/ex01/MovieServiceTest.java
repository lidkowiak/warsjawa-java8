package pl.touk.wasjawa.java8.exercise.ex01;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.junit.Test;

import pl.touk.wasjawa.java8.exercise.common.movies.Actor;
import pl.touk.wasjawa.java8.exercise.common.movies.Movie;
import pl.touk.wasjawa.java8.exercise.common.movies.MovieFactory;
import pl.touk.wasjawa.java8.exercise.ex01.answer.MovieService;

public class MovieServiceTest {

    public final MovieService movieService = new MovieService();

    @Test
    public void shouldFilterPolishActorsName() {
        //given
        Movie goldenEye = MovieFactory.goldenEye();

        //when
        List<String> polishActorNames = movieService.polishActorNames(goldenEye);

        //then
        assertEquals(1, polishActorNames.size());
        assertEquals("Izabella Scorupco", polishActorNames.get(0));
    }

    @Test
    public void shouldReturnEmptyListWhenMovieIsWithoutPolishActors() {
        //given
        Movie americanBeauty = MovieFactory.americanBeauty();

        //when
        List<String> polishActorNames = movieService.polishActorNames(americanBeauty);

        //then
        assertEquals(0, polishActorNames.size());
    }

    @Test
    public void shouldReturnEmptyListWhenMovieIsWithoutAnyActors() {
        //given
        List<Actor> actors = Collections.emptyList();
        Movie someMovie = new Movie("some unknown movie", 1999, actors);

        //when
        List<String> polishActorNames = movieService.polishActorNames(someMovie);

	// then
	assertEquals(0, polishActorNames.size());
    }

}