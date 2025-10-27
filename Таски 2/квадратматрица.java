import java.util.*;

public class квадратматрица {

    public static int diagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();

        input = input.replaceAll("\\s+", "")
                     .replaceAll("^\\[\\[", "")
                     .replaceAll("]]$", "");

        String[] rows = input.split("],\\[");

        int n = rows.length;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] nums = rows[i].split(",");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(nums[j]);
            }
        }

        System.out.println(diagonalSum(matrix));
    }
}
