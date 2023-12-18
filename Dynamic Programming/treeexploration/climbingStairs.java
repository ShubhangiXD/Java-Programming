package treeexploration;

import java.util.HashMap;

public class climbingStairs {
    public static int climbStairs(int n){
        return climbStairs(n, new HashMap<>());
    }

    public static int climbStairs(int n, HashMap<Integer, Integer> memo){
        if (n==0 || n==1) return 1;
        if (memo.containsKey(n)) return memo.get(n);
        int count = climbStairs(n-1, memo) + climbStairs(n-2, memo);
        memo.put(n, count);
        return count;
    }
}
