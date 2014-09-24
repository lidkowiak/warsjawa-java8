package pl.touk.wasjawa.java8.exercise.ex13;

import java.time.ZonedDateTime;

public class User {
    private String name;
    private ZonedDateTime registeredDate;
    private ZonedDateTime dayOfBirth;

    User(String name, ZonedDateTime registeredDate, ZonedDateTime dayOfBirth) {
        this.name = name;
        this.registeredDate = registeredDate;
        this.dayOfBirth = dayOfBirth;
    }

    public String getName() {
        return name;
    }

    public ZonedDateTime getRegisteredDate() {
        return registeredDate;
    }

    public boolean haveBirthDay() {
        return ZonedDateTime.now().toLocalDate().isEqual(dayOfBirth.toLocalDate());
    }
}
