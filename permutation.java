
//Check Permutation
import java.util.*;

public class permutation {
    public static void main(String[] args) {
        String per1 = "tim";
        String per2 = "mit";

        System.out.println(isPerm(per1, per2));
    }

    public static boolean isPerm(String a, String b) {
        boolean perm = true;
        int big = 0;
        int lil = 0;

        if (a.length() >= b.length()) {
            big = a.length();
            lil = b.length();
        } else {
            big = b.length();
            lil = a.length();
        }

        if (b.length() % a.length() != 0) {
            perm = false;
        } else {
            int jump = big / lil;
            for (int i = 0; i < big; i += jump) {
                if (!a.equals(b.substring(i, i + jump))) {
                    perm = false;
                }
            }
        }

        return perm;
    }
}
