package io.badadal.sumanth;
/**
 * @author sbadadal
 */

import java.util.stream.Stream;

/**
 * Program is to find longest sequence of zeros in binary representation of an integer.
 *
 * Eg 1 : 9 has binary representation 1001 and contains a binary gap of length 2
 * Eg 2 : 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3
 * Eg 3 : 15 has binary representation 1111 and has no binary gaps
 */

public class BinaryGaps {

    public static void main(String[] args) {

        int number = 1041;

        char[] binArray = Integer.toBinaryString(number).toCharArray();
        int maxGapsNum = BinaryGaps.getGapCount(binArray);
        if (maxGapsNum > 0) {
            System.out.println("Bianry format of given Number = " );
            Stream.of(binArray).forEach(x -> System.out.println(x));
            System.out.println("Max Gap value = " + maxGapsNum);
        } else {
            System.out.println("INTEGER DOESNT HAS GAPS");
        }
    }

    public static int getGapCount(char[] binArray) {
        int maxValue = 0;
        boolean firstFlag = false;
        int counter = 0;
        for (char aBinArray : binArray) {
            if (aBinArray == '1' && !firstFlag) {
                firstFlag = true;
            } else if ((firstFlag && aBinArray == '0')) {
                counter++;
            } else if (firstFlag && aBinArray == '1') {
                maxValue = maxValue > counter ? maxValue : counter;
                counter = 0;
            }
        }
        return maxValue;
    }

}
