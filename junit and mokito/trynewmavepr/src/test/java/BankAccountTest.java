import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount nn=new BankAccount();
    @Test
    void testbalance() throws InsufficientFundsException {

        Integer actual=nn.withdraw(1000);
        assertEquals(4000,actual);
    }
    @Test
    void testbalance1()  {

        assertThrows(InsufficientFundsException.class,()->nn.withdraw(10000));
    }
}