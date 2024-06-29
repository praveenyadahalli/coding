package greedy.minimizationProblem;

import java.util.Arrays;

public class MinimumCoinsProblem {

    public static void main(String[] args) {
        int[] coinDenominations = {25, 10, 5};
        int amount = 63;
        int[] result = makeChange(coinDenominations, amount);
        System.out.println("Minimum coins needed: " + Arrays.toString(result));
    }

    public static int[] makeChange(int[] coins, int amount) {
        Arrays.sort(coins);

        int[] change = new int[coins.length];
        int remainingAmount = amount;

        for (int i = 0; i < coins.length; i++) {
            change[i] = remainingAmount / coins[i];
            remainingAmount %= coins[i];
        }

        return change;
    }
}
