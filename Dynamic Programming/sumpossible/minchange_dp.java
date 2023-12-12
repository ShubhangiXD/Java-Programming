package sumpossible;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class minchange_dp {
    public static int change(int amount, List<Integer> coins){
        return change(amount, coins, new HashMap<>());
    }
    public static int change(int amount, List<Integer> coins, HashMap<Integer, Integer> memo) {
        if (amount == 0) return 0;
        if (amount < 0) return -1;
        if (memo.containsKey(amount)) return memo.get(amount); //added base case for memo-ed value

        int minCoins = -1;
        for (int coin : coins) {
            int subAmt = amount - coin;
            int currCoins = change(subAmt, coins, memo); //looking up the memo as well
            if (currCoins != -1) {
                int numCoins = currCoins + 1;
                if (numCoins < minCoins || minCoins == -1) {
                    minCoins = numCoins;
                }
            }
        }
        memo.put(amount, minCoins);
        return minCoins;
    }
    public static void main(String[] args) {
        List<Integer> newl = new ArrayList<>();
        newl.add(1);
        newl.add(2);
        newl.add(3);
        System.out.println(change(100, newl));
    }
}
