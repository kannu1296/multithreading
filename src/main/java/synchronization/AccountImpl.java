package synchronization;

import org.springframework.stereotype.Component;

@Component
public class AccountImpl {
    private int balance = 0;

    public void credit(int amount){
        this.balance += amount;
    }

    public void debit(int amount){
        if((this.balance - amount) >= 0)
            this.balance -= amount;
    }

    public int getBalance(){
        return this.balance;
    }
}
