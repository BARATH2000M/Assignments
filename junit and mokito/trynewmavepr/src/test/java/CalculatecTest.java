import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatecTest {

    @DisplayName("Adding two numbers")
    @Test
    void addi() {
        assertAll(
                ()->assertEquals(4,Calculatec.addi(2,2)),
                ()->assertEquals(5,Calculatec.addi(3,2)),
                ()->assertEquals(65,Calculatec.addi(45,10))
        );

    }
}