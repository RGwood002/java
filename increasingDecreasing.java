//not finished

import java.util.*;

public class increasingDecreasing {
    public static void main(String[] args) {
        String test = "longus";
        // sort(test);
        biggest(test);
    }

    public static String sort(String s) {
        char[] sChar = s.toCharArray();
        char currentChar = smallest(s);
        StringBuilder test = new StringBuilder(s);
        StringBuilder fin = new StringBuilder();

        while (test.length() != 0) {

        }

        return fin.toString();
    }

    public static char smallest(String s) {
        char small = 'z';
        for (char item : s.toCharArray()) {
            if (item < small) {
                small = item;
            }
        }
        System.out.println(small);
        return small;
    }

    public static char biggest(String s) {
        char big = 'a';
        for (char item : s.toCharArray()) {
            if (item > big) {
                big = item;
            }
        }
        System.out.println(big);

        return big;
    }
}
