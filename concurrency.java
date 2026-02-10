class BankAccount{
    private int balance =1000;
    // race condition checked as we did not use synchronized keyword , it will now lock the object for current thread
    public synchronized void withdraw(int amount){
        System.out.println("amount withdrawing:"+amount);
        if(balance>=amount){
            try{
                Thread.sleep(100); // simulating network delay
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            balance= balance-amount;
            System.out.println("withdrawl complete , Remaining balance :"+balance);
        }else{
            System.out.println("failed to withdraw due to insufficient funds! ,Remaining balance:"+balance);
        }
    }
}


public class concurrency {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Thread Alice = new Thread(() -> account.withdraw(700));
        Thread Bob = new Thread(() -> account.withdraw(700));

        Alice.start();
        Bob.start();
    }
}
