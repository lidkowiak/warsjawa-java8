package pl.touk.wasjawa.java8.exercise.ex14.answer;

import pl.touk.wasjawa.java8.exercise.ex14.ImageQuality;
import pl.touk.wasjawa.java8.exercise.ex14.Logger;

import java.awt.*;
import java.util.function.Supplier;

public class Exercise14 implements ImageQuality {

    public double measureImageContrast(Image image) {
        return measurePerformance(() -> {
            System.out.println("measureImageContrast executing...");
            //Do something what take time
            return 0.87;
        });
    }

    public double measureImageBrightness(Image image) {
        return measurePerformance(() -> {
            System.out.println("measureImageBrightness executing...");
            //Do something what take time
            return 0.94;
        });
    }

    public static <T> T measurePerformance(Supplier<T> action) {
        long startTime = System.nanoTime();
        T result = action.get();
        long endTime = System.nanoTime();
        Logger.debug("measureImageBrightness execution take: " + (endTime - startTime) / 1_000_000 + " milliseconds");
        return result;
    }


}
