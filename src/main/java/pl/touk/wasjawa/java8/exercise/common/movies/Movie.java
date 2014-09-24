package pl.touk.wasjawa.java8.exercise.common.movies;

import java.util.List;

public class Movie {
    private final String title;
    private final int releaseYear;
    private final List<Actor> actors;

    public Movie(String title, int releaseYear, List<Actor> actors) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.actors = actors;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public List<Actor> getActors() {
        return actors;
    }
}
