import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxFinderQ1Test {

    MinMaxFinderQ1 mn=new MinMaxFinderQ1();
    @Test
    void minMax1() {
        assertAll(
                ()->assertArrayEquals(new int[]{1, 5},mn.minMax1(new int[]{2, 5, 3, 4, 1})),
                ()->assertArrayEquals(new int[]{10, 60},mn.minMax1(new int[]{10, 60, 55, 36, 47, 33, 52})),
                ()->assertArrayEquals(new int[]{-30, 30},mn.minMax1(new int[]{2,25,-30,-22,11,10,-28,29,30}))
        );
    }
}