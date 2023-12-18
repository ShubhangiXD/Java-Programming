package treeexploration;

import java.util.HashMap;

public class minPerfectSquareSum {
    public static int summingSquares(int n) {
        return (int)summingSquares(n, new HashMap<>());
    }

    public static double summingSquares(int n, HashMap<Integer, Double> memo) {
        if (n == 0) return 0;
        if (memo.containsKey(n)) return memo.get(n);

        double minSq = Double.POSITIVE_INFINITY;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            int sq = i * i;
            double numSq = 1 + summingSquares(n - sq, memo);
            if (minSq > numSq) minSq = numSq;
        }
        double res = minSq;
        memo.put(n, res);
        return minSq;
    }
}
