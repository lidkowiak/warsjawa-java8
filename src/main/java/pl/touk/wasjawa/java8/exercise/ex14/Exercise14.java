package pl.touk.wasjawa.java8.exercise.ex14;

import java.awt.*;

public class Exercise14 implements ImageQuality {

    public double measureImageContrast(Image image) {
        long startTime = System.nanoTime();

        //measureImageContrast main code
        System.out.println("measureImageContrast executing...");
        //Do something what take time
        double result = 0.87;

        long endTime = System.nanoTime();
        Logger.debug("measureImageContrast execution take: " + (endTime - startTime) / 1_000_000 + " milliseconds");
        return result;
    }

    public double measureImageBrightness(Image image) {
        long startTime = System.nanoTime();

        //measureImageContrast main code
        System.out.println("measureImageBrightness executing...");
        //Do something what take time
        double result = 0.94;

        long endTime = System.nanoTime();
        Logger.debug("measureImageBrightness execution take: " + (endTime - startTime) / 1_000_000 + " milliseconds");
        return result;
    }


}
