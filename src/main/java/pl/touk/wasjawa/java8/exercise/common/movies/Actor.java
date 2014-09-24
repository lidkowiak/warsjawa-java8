package pl.touk.wasjawa.java8.exercise.common.movies;

import pl.touk.wasjawa.java8.exercise.common.CountryCode;

public class Actor {
    private final String firstName;
    private final String lastName;
    private final CountryCode countryOfBirth;

    public Actor(String firstName, String lastName, CountryCode countryOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.countryOfBirth = countryOfBirth;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public CountryCode getCountryOfBirth() {
        return countryOfBirth;
    }
}
