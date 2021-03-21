import bankingApplication.Account;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
class AccountTest {

    @Test
    void account_canBeDepositedInto(){
        //given
        Account frankAccount = new Account();
        //when
        frankAccount.depositMoney(2500.0);
        //assert
        double balance =frankAccount.getAccountBalance();
        assertEquals(2500.00,balance );


    }
    @Test
    public void accountCanReceiveDoubleDepositTest(){
        //given
        Account sarahAccount = new Account();
        sarahAccount.depositMoney(500);

        //when
        sarahAccount.depositMoney(3500);

        //assert
        assertEquals(4000,sarahAccount.getAccountBalance());
    }
    @Test
    void accountCannotReceiveNegativeDepositTest(){
        Account humbleAccount = new Account();
        humbleAccount.depositMoney(-970297372);
        assertEquals(0,humbleAccount.getAccountBalance());
    }
}