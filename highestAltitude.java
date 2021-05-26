import java.util.Arrays;

public class highestAltitude {
    public static void main(String[] args) {
        int[] test = { -4, -3, -2, -1, 4, 3, 2 };
        altitude(test);
    }

    public static int altitude(int[] gain) {
        int max = 0;
        int[] alt = new int[gain.length + 1];
        alt[0] = 0;

        for (int i = 1; i < alt.length; i++) {
            alt[i] = alt[i - 1] + gain[i - 1];
            if (max < alt[i]) {
                max = alt[i];
            }
        }

        return max;
    }
}
