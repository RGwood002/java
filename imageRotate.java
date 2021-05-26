import java.util.*;

public class imageRotate {
    public static void main(String[] args) {
        int[][] flip = new int[4][4];

        for (int i = 0; i < flip.length; i++) {
            for (int j = 0; j < flip[i].length; j++) {
                flip[i][j] = i + j;
            }
        }

        System.out.println(Arrays.deepToString(flip));

        System.out.println(Arrays.deepToString(flipped(flip)));
    }

    public static int[][] flipped(int[][] toFlip) {
        int temp = 0;

        for (int i = 0; i < toFlip.length; i++) {

        }

        return toFlip;
    }

}
