//leetcode #7

import java.util.*;

public class reverse_int {
    public static void main(String[] args) {
        int input = 1534236469;

        System.out.println(reverse(input));
    }

    public static int reverse(int x) {
        long r = 0;
        int num = x;

        while (num != 0) { // Taking the digit at each place and singling it out without needing to store
                           // it in a string[]
            int digit = num % 10;
            r = r * 10 + digit;
            num /= 10;
        }

        if ((r <= Integer.MIN_VALUE || (r >= Integer.MAX_VALUE))) {
            r = 0;
        }

        return (int) r;
    }
}
