package pl.touk.wasjawa.java8.exercise.ex11.answer;

import org.junit.Assert;
import org.junit.Test;

import pl.touk.wasjawa.java8.exercise.ex11.Exercise11;

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

    @Test
    public void shouldAddMethodThrowExceptionOnNegativeInput_thirdTest() {
        //given
        Exercise11 exercise10 = new Exercise11(0);

        //expect
        assertException(
                IllegalArgumentException.class,
                () -> exercise10.add(-5));
    }

    private void assertException(Class<? extends Exception> exceptionClass, Runnable expect) {
        try {
            expect.run();
        } catch (Exception ex) {
            if (!exceptionClass.isAssignableFrom(ex.getClass())) {
                throw ex;
            }
        }
    }

}
