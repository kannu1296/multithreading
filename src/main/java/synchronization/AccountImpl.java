package synchronization;

import org.springframework.stereotype.Component;

/**
 * Utility to maintain account information
 */
@Component
public class AccountImpl implements Account {
    private int balance = 0;

    @Override
    public void credit(int amount){
        this.balance += amount;
    }

    @Override
    public void debit(int amount){
        if((this.balance - amount) >= 0)
            this.balance -= amount;
    }

    @Override
    public int getBalance(){
        return this.balance;
    }
}
