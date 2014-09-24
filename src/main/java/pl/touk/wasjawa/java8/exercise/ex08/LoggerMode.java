package pl.touk.wasjawa.java8.exercise.ex08;

public enum LoggerMode {
    TRACE(1),
    DEBUG(2),
    INFO(3),
    WARNING(4),
    ERROR(5);

    private final int level;

    LoggerMode(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
