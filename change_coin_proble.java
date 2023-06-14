
import java.util.ArrayList;
public class change_coin_proble {

  static void coinChange(int[] cost, int amount, String result, int index, ArrayList<Integer> results) {
        if (amount == 0) {
            results.add(Integer.parseInt(result));
            return;
        }

        for (int i = index; i < cost.length; i++) {
            if (amount >= cost[i]) {
                coinChange(cost, amount - cost[i], result + cost[i], i, results);
            }
        }
    }

    public static void main(String[] args) {
        int[] coins = {2, 3, 5, 6};
        int amount = 10;
        ArrayList<Integer> results = new ArrayList<>();
        coinChange(coins, amount, "", 0, results);

        int minResult = Integer.MAX_VALUE;

        // Find the minimum result value
        for (int result : results) {
            if (result < minResult) {
                minResult = result;
            }
        }

        System.out.println("Minimum value: " + minResult);
    }
}