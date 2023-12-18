package treeexploration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class minPerfectSquareSumTest {

    @Test
    void summingSquares1() {
        assertEquals(2, minPerfectSquareSum.summingSquares(8));
    }
    @Test
    void summingSquares2() {
        assertEquals(1, minPerfectSquareSum.summingSquares(9));
    }
    @Test
    void summingSquares3() {
        assertEquals(3, minPerfectSquareSum.summingSquares(12));
    }
    @Test
    void summingSquares4() {
        assertEquals(4, minPerfectSquareSum.summingSquares(31));
    }
    @Test
    void summingSquares() {
        assertEquals(4, minPerfectSquareSum.summingSquares(87));
    }
}