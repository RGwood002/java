//leetcode #1323 Maximum 69 Number
//0ms Faster than 100% of java submissions;
//35.6 MB, less than 87% of java submissions;

import java.util.*;

public class MaximumSixNine {
    public static void main(String[] args) {
        int input = 96996;
        System.out.println(maximum69Number(input));

    }

    public static int maximum69Number(int num) {
        int max = num;
        if ((max / 10000) % 10 == 6) {
            max += 30000;
        }
        if ((max / 1000) % 10 == 6) {
            max += 3000;
        } else if ((max / 100) % 10 == 6) {
            max += 300;
        } else if ((max / 10) % 10 == 6) {
            max += 30;
        } else if (max % 10 == 6) {
            max += 3;
        }
        return max;
    }
}
