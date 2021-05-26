import java.util.*;

public class goodTriplets {
    public static void main(String[] args) {
        int[] arr = { 3, 0, 1, 1, 9, 7 };
        int a = 7;
        int b = 2;
        int c = 3;

        System.out.println(countGoodTriplets(arr, a, b, c));
    }

    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int total = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int x = arr[i];
                    int y = arr[j];
                    int z = arr[k];

                    if (lessThan(x, y, a) && (lessThan(y, z, b) && lessThan(x, z, c))) {
                        total++;
                    }

                }
            }
        }

        return total;
    }

    public static boolean lessThan(int x, int y, int a) {
        boolean bl = false;
        int diff = x - y;
        if (Math.abs(diff) <= a) {
            bl = true;
        }

        return bl;
    }

}
