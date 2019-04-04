package io.badadal.sumanth;

import java.util.Arrays;

/**
 * @author sbadadal
 * Program is to Rotate the given array N times.
 * Eg 1 : {1, 5, 2, 4} -> 2  Times -> {2, 4, 1, 5}
 */
public class ArrayRotation {

    public static void main(String[] args) {
        ArrayRotation arrayRotation = new ArrayRotation();
        int[] givenArray = {1, 5, 2, 4};
        int numberOfTimeToRotate = 2;
        int[] results = arrayRotation.rotateArray(givenArray, numberOfTimeToRotate);

        System.out.println(Arrays.toString(results));

    }

    int[] rotateArray(int[] givenArray, int numberOfTimes) {

        int lengthOfGivenArray = givenArray.length;

        int[] rotatedArray = new int[lengthOfGivenArray];

        for (int loopCount = 0; loopCount < lengthOfGivenArray; loopCount++) {
            int rotatedIndex = (loopCount + numberOfTimes) % lengthOfGivenArray;
            rotatedArray[rotatedIndex] = givenArray[loopCount];
        }


        return rotatedArray;
    }
}
