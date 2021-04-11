package synchronization;

/**
 * Utility to withdraw cash from account
 */
public class Withdrawal implements Runnable {
    private Account account;

    public Withdrawal(Account account) {
        this.account = account;
    }

    @Override
    public void run(){
        account.credit(100);
        for(int i = 0; i<5; i++){
            makeWithdrawal(50);
        }
    }

    public void makeWithdrawal(int amount){
        synchronized (this){
            if(account.getBalance() >= amount){
                try{
                    Thread.sleep(100);
                }catch (InterruptedException exception){
                    exception.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() +" Successfully withdrawn the amount");
                account.debit(amount);
            }else {
                System.out.println("Not enough amount for " + Thread.currentThread().getName() + " " + account.getBalance());
            }
        }
    }
}
