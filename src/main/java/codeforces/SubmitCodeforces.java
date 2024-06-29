package codeforces;
import java.util.Scanner;

public class SubmitCodeforces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();  // Number of test cases
        int[][] testCases = new int[t][];

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            String x = scanner.nextLine();
            String s = scanner.nextLine();

            testCases[i] = new int[]{n, m, x.length(), s.length()};
        }

        int[] results = minOperationsToSubstring(t, testCases);

        for (int result : results) {
            System.out.println(result);
        }
    }
    static int[] minOperationsToSubstring(int t, int[][] testCases) {
        int[] results = new int[t];

        for (int i = 0; i < t; i++) {
            int n = testCases[i][0];
            int m = testCases[i][1];
            int xLength = testCases[i][2];
            int sLength = testCases[i][3];

            // Calculate the minimum number of operations needed
            int repetitions = (m + n - 1) / n;
            results[i] = repetitions * n;
        }

        return results;
    }
}
