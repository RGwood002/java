//leetcode 1572 Diagonal Sum

public class diagonalSum {
    public static void main(String[] args) {
        int[][] input = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        System.out.println(diagonalSum(input));
    }

    public static int diagonalSum(int[][] mat) {
        int total = 0;

        for (int i = 0, k = mat[i].length - 1; i < mat.length; i++, k--) {
            total = total + mat[i][i];
            if (i != k) {
                total = total + mat[i][k];
            }
            System.out.println(total);
        }

        return total;
    }
}
