package Abstraction;

public class CurrentAccount extends BankAccount{
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void diposit(double amount){
        System.out.println("Deposited to current....");
    }
    @Override
    public void withdraw(double amount){
        System.out.println("Withdraw to current....");
    }
}

