import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Q4Test {

    Q4 q4;
    @BeforeAll
    static void start(){
        System.out.println("Testing process is starting");
    }
    @AfterAll
    static void finish(){
        System.out.println("Testing Process completed");
    }

    @BeforeEach
    void init(){
        q4=new Q4();
    }
    @AfterEach
    void TestDone(){
        System.out.println("Test completed");
    }

    @Test
    void testAdd() {
        int expected = 2;
        int actual = q4.add(1,1);
        assertEquals(expected,actual,"The add method should add two numbers");

    }
    @Test
    void testDivide() {

        assertThrows(ArithmeticException.class, () -> q4.divide(1,0),
                "Divide should throw ArithmeticException when denominator is zero");
    }
    @Test
    void testcomputeCircleRadius() {

        assertEquals(314.1592653589793,q4.computeCircleArea(10),"Should return right circle Area");
    }

}