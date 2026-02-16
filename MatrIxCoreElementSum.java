import java.util.*;

public class MatrixCoreElementSum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();

        int[][] matrix = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        int sum = 0;

        for (int i = 1; i < r - 1; i++) {
            for (int j = 1; j < c - 1; j++) {
                sum = sum + matrix[i][j];
            }
        }

        System.out.println(sum);
    }
}
