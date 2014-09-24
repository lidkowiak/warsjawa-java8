package pl.touk.wasjawa.java8.exercise.ex14.classicAnswer;

import pl.touk.wasjawa.java8.exercise.ex14.*;

import java.awt.*;

public class ImageQualityMeasurePerformance implements ImageQuality {

    private final ImageQuality decoratedImageQuality;

    public ImageQualityMeasurePerformance(ImageQuality decoratedImageQuality) {
        this.decoratedImageQuality = decoratedImageQuality;
    }

    @Override
    public double measureImageContrast(Image image) {
        long startTime = System.nanoTime();

        double result = decoratedImageQuality.measureImageContrast(image);

        long endTime = System.nanoTime();
        Logger.debug("measureImageContrast execution take: " + (endTime - startTime) / 1_000_000 + " milliseconds");
        return result;
    }

    @Override
    public double measureImageBrightness(Image image) {
        long startTime = System.nanoTime();

        double result = decoratedImageQuality.measureImageBrightness(image);

        long endTime = System.nanoTime();
        Logger.debug("measureImageContrast execution take: " + (endTime - startTime) / 1_000_000 + " milliseconds");
        return result;
    }
}
