package io.badadal.sumanth;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author sbadadal
 */
public class BinaryGapsTest {

    @Test
    public void getGapCount_for_9() {

        //given
        int numberTobeTested = 9;

        //then
        int actualNumberOfZeros = BinaryGaps.getGapCount(numberTobeTested);
        Assert.assertEquals(2, actualNumberOfZeros);
    }


    @Test
    public void getGapCount_for_1041() {

        //given
        int numberTobeTested = 1041;

        //then
        int actualNumberOfZeros = BinaryGaps.getGapCount(numberTobeTested);
        Assert.assertEquals(5, actualNumberOfZeros);
    }

    @Test
    public void getGapCount_for_zero() {

        //given
        int numberTobeTested = 0;

        //then
        int actualNumberOfZeros = BinaryGaps.getGapCount(numberTobeTested);
        Assert.assertEquals(0, actualNumberOfZeros);
    }

}