package synchronization;

public class AccountTesting {
    public static void main(String[] args) {
        AccountImpl account = new AccountImpl();
        Withdrawal withdrawal = new Withdrawal(account);
        Thread thread1 = new Thread(withdrawal);
        Thread thread2 = new Thread(withdrawal);

        thread1.setName("Person1"); //rename thread as person1
        thread2.setName("Person2"); //rename thread as person2

        thread1.start();
        thread2.start();
    }
}
