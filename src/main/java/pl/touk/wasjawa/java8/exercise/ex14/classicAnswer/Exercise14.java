package pl.touk.wasjawa.java8.exercise.ex14.classicAnswer;

import pl.touk.wasjawa.java8.exercise.ex14.ImageQuality;

import java.awt.*;

public class Exercise14 implements ImageQuality {

    public double measureImageContrast(Image image) {
        System.out.println("measureImageContrast executing...");
        //Do something what take time
        return 0.87;
    }

    public double measureImageBrightness(Image image) {
        System.out.println("measureImageBrightness executing...");
        //Do something what take time
        return 0.94;
    }
}
