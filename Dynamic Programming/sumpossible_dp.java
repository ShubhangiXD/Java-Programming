import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class sumpossible_dp {
    public static boolean sumPoss(int amount, List<Integer> numbers) {
        return sumPoss(amount, numbers, new HashMap<>());
    }

    public static boolean sumPoss(int amount, List<Integer> numbers, HashMap<Integer, Boolean> memo) {
        if (amount == 0) return true;
        if (amount < 0) return false;
        if (memo.containsKey(amount)) return memo.get(amount);
        for (int num : numbers) {
            int subAmt = amount - num;
            if (sumPoss(subAmt, numbers, memo)) {
                memo.put(amount, true);
                return true;
            }
        }
        memo.put(amount, false);
        return false;
    }

    public static void main(String[] args) {
        List<Integer> newl = new ArrayList<>();
        newl.add(1);
        newl.add(2);
        newl.add(3);
        System.out.println(sumPoss(5, newl));
    }
}
