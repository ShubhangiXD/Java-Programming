package pathproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class maxPathSum_dyprog {
    public static int pathSum(List<List<Integer>> grid) {
        return (int) pathSum(0, 0, grid, new HashMap<>());
    }

    public static double pathSum(int r, int c, List<List<Integer>> grid, HashMap<List<Integer>, Double> memo) {
        if (r == grid.size() || c == grid.get(0).size()) return Double.NEGATIVE_INFINITY;
        if (r == grid.size() - 1 && c == grid.size() - 1) return grid.get(r).get(c);

        List<Integer> pos = List.of(r, c);
        if (memo.containsKey(pos)) return memo.get(pos);

        double res = grid.get(r).get(c) + Math.max(pathSum(r + 1, c, grid, memo), pathSum(r, c + 1, grid, memo));
        memo.put(pos, res);
        return res;
    }

    public static void main(String[] args) {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(1, 7, 3));
        grid.add(Arrays.asList(4, 8, 2));
        grid.add(Arrays.asList(15, 9, 6));

        System.out.println(pathSum(grid));
    }
}
