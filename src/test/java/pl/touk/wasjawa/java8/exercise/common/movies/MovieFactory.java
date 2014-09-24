package pl.touk.wasjawa.java8.exercise.common.movies;

import pl.touk.wasjawa.java8.exercise.common.CountryCode;

import java.util.ArrayList;
import java.util.List;

public class MovieFactory {

    public static Movie goldenEye() {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Pierce", "Brosnan", CountryCode.IE));
        actors.add(new Actor("Sean", "Bean", CountryCode.GB));
        actors.add(new Actor("Izabella", "Scorupco", CountryCode.PL));
        actors.add(new Actor("Famke", "Janssen", CountryCode.NL));
        return new Movie("GoldenEye", 1995, actors);
    }

    public static Movie americanBeauty() {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Kevin", "Spacey", CountryCode.US));
        actors.add(new Actor("Annette", "Bening", CountryCode.US));
        actors.add(new Actor("Thora", "Birch", CountryCode.US));
        actors.add(new Actor("Wes", "Bentley", CountryCode.US));
        return new Movie("American Beauty", 1999, actors);
    }

    public static Movie childrenOfMen() {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Clive", "Owen", CountryCode.GB));
        actors.add(new Actor("Julianne", "Moore", CountryCode.US));
        actors.add(new Actor(" Michael", "Caine", CountryCode.GB));
        actors.add(new Actor("Jacek", "Koman", CountryCode.PL));
        return new Movie("Children of Men", 2006, actors);
    }
}
