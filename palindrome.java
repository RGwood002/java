
//Leetcode #9 Palindrome number
import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        int input = 1;
        isPalindrome(input);
    }

    public static boolean isPalindrome(int x) {
        boolean pal = true;
        String word = String.valueOf(x);
        int p1 = 0;
        int p2 = word.length() - 1;

        if (word.length() % 2 == 0) { // word length is even
            while (p1 < p2) {
                if (word.charAt(p1) != word.charAt(p2)) {
                    pal = false;
                    break;
                }
                p1++;
                p2--;
            }
        } else { // word length is odd
            while (p1 != p2) {
                if (word.charAt(p1) != word.charAt(p2)) {
                    pal = false;
                    break;
                }
                p1++;
                p2--;
            }
        }

        System.out.println(pal);
        return pal;
    }
}
