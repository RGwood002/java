// Problem 1588 on Leetcode
//only faster than 5% of submissions 
//terrible brute force approach

import java.util.*;

public class sumOfOddArray {
    public static void main(String[] args) {
        int[] input = { 1, 4, 2, 5, 3 };

        sumOddLengthSubArrays(input);
    }

    public static int sumOddLengthSubArrays(int[] arr) {
        int output = 0;

        for (int i = 0; i < arr.length; i++) {
            int k = 1;
            while (i + k <= arr.length) {
                int[] temp = Arrays.copyOfRange(arr, i, i + k);
                output = output + Arrays.stream(temp).sum();
                k += 2;
            }

        }

        return output;
    }
}
