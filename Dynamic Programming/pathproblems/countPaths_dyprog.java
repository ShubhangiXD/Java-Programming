package pathproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class countPaths_dyprog {
    public static int countPaths(List<List<String>> grid) {
        return countPaths(0, 0, grid, new HashMap<>());
    }

    public static int countPaths(int r, int c, List<List<String>> grid, HashMap<List<Integer>, Integer> memo) {
        //base cases
        if (r == grid.size() || c == grid.get(0).size()) return 0; //current position out of bounds
        if (grid.get(r).get(c).equals("X")) return 0; //running into a wall
        if (r == grid.size() - 1 && c == grid.size() - 1) return 1; //base case (bottom right corner)
        List<Integer> pos = List.of(r, c); //base case for r, c in memo
        if (memo.containsKey(pos)) return memo.get(pos);
        //recursive cases
        int res = countPaths(r+1, c, grid, memo) + countPaths(r, c+1, grid, memo);
        memo.put(pos, res);
        return  res;
    }

    public static void main(String[] args) {
        List<List<String>> grid = new ArrayList<>();

        // Initialize the grid with sample values
        grid.add(Arrays.asList(".","X",".","."));
        grid.add(Arrays.asList(".",".",".","X"));
        grid.add(Arrays.asList(".","X",".","."));
        grid.add(Arrays.asList(".","X",".","."));

        // Call the countPaths function
        int totalPaths = countPaths(grid);

        // Print the total number of paths
        System.out.println("Total paths: " + totalPaths);
    }
}
