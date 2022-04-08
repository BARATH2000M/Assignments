import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxFinderTest {
    MinMaxFinder mm=new MinMaxFinder();


    @Test
    void minMax() {
        assertAll(
        ()->assertEquals("Min=1; Max=5",mm.minMax(new int[]{2, 5, 3, 4, 1})),
        ()->assertEquals("Min=10; Max=60",mm.minMax(new int[]{10, 60, 55, 36, 47, 33, 52})),
        ()->assertEquals("Min=-30; Max=30",mm.minMax(new int[]{2,25,-30,-22,11,10,-28,29,30}))
                );
    }
}