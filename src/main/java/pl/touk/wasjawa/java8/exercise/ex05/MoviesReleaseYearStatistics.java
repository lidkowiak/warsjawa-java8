package pl.touk.wasjawa.java8.exercise.ex05;

public class MoviesReleaseYearStatistics {
    private final int oldestMovieYear;
    private final int newestMovieYear;
    private final double averageReleaseYear;

    public MoviesReleaseYearStatistics(int oldestMovieYear, int newestMovieYear, double averageReleaseYear) {
        this.oldestMovieYear = oldestMovieYear;
        this.newestMovieYear = newestMovieYear;
        this.averageReleaseYear = averageReleaseYear;
    }

    public int getOldestMovieYear() {
        return oldestMovieYear;
    }

    public int getNewestMovieYear() {
        return newestMovieYear;
    }

    public double getAverageReleaseYear() {
        return averageReleaseYear;
    }
}
