package synchronization;

import org.springframework.stereotype.Service;

@Service
public interface Account {
    public void credit(int amount);
    public void debit(int amount);
    public int getBalance();
}
