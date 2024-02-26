package Day8;

abstract class Bank {
    abstract public void getBalance();
    abstract public void deposit(int deposit);
}

class BankA extends Bank{
    private int balance;
    @Override
    public void deposit(int deposit) {
        balance += deposit;
    }
    @Override
    public void getBalance() {
        System.out.println("The current balance of BankA is: $" + balance);
    }
}

class BankB extends Bank{
    private int balance;
    @Override
    public void deposit(int deposit) {
        balance += deposit;
    }
    @Override
    public void getBalance() {
        System.out.println("The current balance of BankB is: $" + balance);
    }
}

class BankC extends Bank{
    private int balance;
    @Override
    public void deposit(int deposit) {
        balance += deposit;
    }
    @Override
    public void getBalance() {
        System.out.println("The current balance of BankC is: $" + balance);
    }
}

public class Exercise5 {
    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        bankA.deposit(100);
        bankB.deposit(150);
        bankC.deposit(200);

        bankA.getBalance();
        bankB.getBalance();
        bankC.getBalance();
    }
}
