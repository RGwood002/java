//leetcode #832 Flipping an Image
//1 ms 38.9mb

import java.util.*;

public class flipAndInvertImage {
    public static void main(String[] args) {
        int[][] input = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        flipAndInvert(input);
    }

    public static int[][] flipAndInvert(int[][] A) {
        int[][] output = new int[A.length][A[0].length];
        int depth = A[0].length - 1;
        for (int i = A.length - 1; i >= 0; i--) {
            for (int j = A[0].length - 1; j >= 0; j--) {
                output[i][depth - j] = Math.abs(A[i][j] - 1);
            }
        }

        System.out.println(Arrays.deepToString(output));

        return output;
    }
}
