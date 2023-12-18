package treeexploration;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class maxNonAdjSumTest {

    @Test
    void nonAdjSum1() {
        List<Integer> nums = List.of(7, 5, 5, 12);
        assertEquals(19, maxNonAdjSum.nonAdjSum(nums));
    }
    @Test
    void nonAdjSum2() {
        List<Integer> nums = List.of(7, 5, 5, 12, 17, 29);
        assertEquals(48, maxNonAdjSum.nonAdjSum(nums));
    }
    @Test
    void nonAdjSum3() {
        List<Integer> nums = List.of(
                72, 62, 10,  6, 20, 19, 42,
                46, 24, 78, 30, 41, 75, 38,
                23, 28, 66, 55, 12, 17, 9,
                12, 3, 1, 19, 30, 50, 20
        );
        assertEquals(488, maxNonAdjSum.nonAdjSum(nums));
    }
}