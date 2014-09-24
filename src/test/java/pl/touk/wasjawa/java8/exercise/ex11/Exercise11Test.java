package pl.touk.wasjawa.java8.exercise.ex11;

import org.junit.Assert;
import org.junit.Test;

public class Exercise11Test {

    @Test
    public void shouldAddMethodThrowExceptionOnNegativeInput_firstTest() {
        //given
        Exercise11 exercise11 = new Exercise11(0);

        //expect
        try {
            exercise11.add(-5);
            Assert.fail();
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue("OK", true);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldAddMethodThrowExceptionOnNegativeInput_secondTest() {
        //given
        Exercise11 exercise11 = new Exercise11(0);

        //expect
        exercise11.add(-5);
    }
}
