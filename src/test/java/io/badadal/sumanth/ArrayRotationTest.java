package io.badadal.sumanth;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author sbadadal
 */
public class ArrayRotationTest {

    int[] givenArray;

    @Before
    public void setUp() throws Exception {
        givenArray = new int[]{1, 2, 3, 4};
    }

    @Test
    public void shouldNotRotateWhenNumberOfTimesIsZero() {
        //given
        int numberOfTimes = 0;

        //then
        ArrayRotation arrayRotation = new ArrayRotation();
        int[] rotatedArray = arrayRotation.rotateArray(givenArray, numberOfTimes);
        Assert.assertEquals(4, rotatedArray.length);
        Assert.assertEquals(1, rotatedArray[0]);
        Assert.assertEquals(2, rotatedArray[1]);
        Assert.assertEquals(3, rotatedArray[2]);
        Assert.assertEquals(4, rotatedArray[3]);
    }

    @Test
    public void allElementsShouldRotateOneTime() {
        //given
        int numberOfTimes = 1;

        //then
        ArrayRotation arrayRotation = new ArrayRotation();
        int[] rotatedArray = arrayRotation.rotateArray(givenArray, numberOfTimes);
        Assert.assertEquals(4, rotatedArray.length);
        Assert.assertEquals(4, rotatedArray[0]);
        Assert.assertEquals(1, rotatedArray[1]);
        Assert.assertEquals(2, rotatedArray[2]);
        Assert.assertEquals(3, rotatedArray[3]);

    }

    @Test
    public void allElementsShouldRotateFiveTimes() {
        //given
        int numberOfTimes = 5;

        //then
        ArrayRotation arrayRotation = new ArrayRotation();
        int[] rotatedArray = arrayRotation.rotateArray(givenArray, numberOfTimes);
        Assert.assertEquals(4, rotatedArray.length);
        Assert.assertEquals(4, rotatedArray[0]);
        Assert.assertEquals(1, rotatedArray[1]);
        Assert.assertEquals(2, rotatedArray[2]);
        Assert.assertEquals(3, rotatedArray[3]);

    }




}