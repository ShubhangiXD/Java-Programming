package pathproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class countPaths_recursive {
    public static int countPaths(List<List<String>> grid) {
        return countPaths(0, 0, grid);
    }

    public static int countPaths(int r, int c, List<List<String>> grid) {
        //base cases
        if (r == grid.size() || c == grid.get(0).size()) return 0; //current position out of bounds
        if (grid.get(r).get(c).equals("X")) return 0; //running into a wall
        if (r == grid.size() - 1 && c == grid.size() - 1) return 1; //base case (bottom right corner)

        //recursive cases
        return countPaths(r+1, c, grid) + countPaths(r, c+1, grid);
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
