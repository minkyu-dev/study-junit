package chapter13_test.scratch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertTest {
    private Account account;

    @BeforeEach
    void createAccount() {
        account = new Account("an account name");
    }

    @Test
    void hasPositiveBalance() {
        account.deposit(50);
        assertTrue(account.hasPositiveBalance());
    }

    @Test
    void depositIncreasesBalance() {
        int initialBalance = account.getBalance();
        account.deposit(100);

        // 기대값을 명시적으로 지정하는 것이 좋다
        assertThat(account.getBalance(), equalTo(100));
        // assertTrue(account.getBalance() > initialBalance);
    }
}
