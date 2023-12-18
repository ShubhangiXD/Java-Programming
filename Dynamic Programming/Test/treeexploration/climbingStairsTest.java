package treeexploration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class climbingStairsTest {

    @Test
    void climbStairs1() {
        assertEquals(2, climbingStairs.climbStairs(2));
        System.out.println("Expected: 2 Result: " + climbingStairs.climbStairs(2));
    }

    @Test
    void climbStairs2() {
        assertEquals(3, climbingStairs.climbStairs(3));
        System.out.println("Expected: 3 Result: " + climbingStairs.climbStairs(3));
    }
}