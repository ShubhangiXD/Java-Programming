package treeexploration;

import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class maxNonAdjSum {
    public static int nonAdjSum(List<Integer> nums) {
        return nonAdjSum(nums, 0, new HashMap<>());
    }

    public static int nonAdjSum(List<Integer> nums, int i, HashMap<Integer, Integer> memo) {
        if (i >= nums.size()) return 0; //empty list/array
        if (memo.containsKey(i)) return memo.get(i);
        int maxSum = Math.max(nums.get(i) + nonAdjSum(nums, i + 2, memo), //return num at i + next to next index
                nonAdjSum(nums, i + 1, memo));
        memo.put(i, maxSum);
        return maxSum;
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 4, 6, 8, 2, 7);
        System.out.println(nonAdjSum(nums));
    }
}
