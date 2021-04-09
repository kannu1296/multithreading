package synchronization;

public class AccountTesting {
    public static void main(String[] args) {
        Withdrawal withdrawal = new Withdrawal();
        Thread thread1 = new Thread(withdrawal);
        Thread thread2 = new Thread(withdrawal);

        thread1.setName("Person1");
        thread2.setName("Person2");

        thread1.start();
        thread2.start();
    }
}
