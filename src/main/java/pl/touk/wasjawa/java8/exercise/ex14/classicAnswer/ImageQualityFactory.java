package pl.touk.wasjawa.java8.exercise.ex14.classicAnswer;

import pl.touk.wasjawa.java8.exercise.ex14.ImageQuality;

public interface ImageQualityFactory {
    static ImageQuality createWithPerformanceMeasure() {
        return new ImageQualityMeasurePerformance(new Exercise14());
    }
}
