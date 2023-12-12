import java.util.ArrayList;
import java.util.List;

public class sumpossible_recursive {
    public static boolean sumPoss(int amount, List<Integer> numbers) {
        if (amount == 0) return true;
        if (amount < 0) return false;
        for (int num : numbers) {
            int subAmt = amount - num;
            if (sumPoss(subAmt, numbers)) {
                return true;
            }
        }
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
