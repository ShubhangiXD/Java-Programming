package sumpossible;

import java.util.ArrayList;
import java.util.List;

//return least amount of coins to calculate a certain amount; similar to sumpossible
//keep in mind that since we are returning the size of the shortest path, we are not storing the path
public class minchange_recursive {

    public static int change(int amount, List<Integer> coins) {
        if (amount == 0) return 0;
        if (amount < 0) return -1;
        int minCoins = -1;
        for (int coin : coins) {
            int subAmt = amount - coin;
            int currCoins = change(subAmt, coins);
            if (currCoins != -1) {
                int numCoins = currCoins + 1;
                if (numCoins < minCoins || minCoins == -1) {
                    minCoins = numCoins;
                }
            }
        }
        return minCoins;
    }

    public static void main(String[] args) {
        List<Integer> newl = new ArrayList<>();
        newl.add(1);
        newl.add(2);
        newl.add(3);
        System.out.println(change(5, newl));
    }
}
