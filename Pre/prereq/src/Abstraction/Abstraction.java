package Abstraction;

public class Abstraction {
    public static void main(String[] args) {
        SavingsAccount sac = new SavingsAccount("4932423890",48937);
        sac.diposit(100);

        SavingsAccount sac1 = new SavingsAccount("4237498234798",843289);
        sac.diposit(3000);

        BankAccount currentAc1 = new CurrentAccount("80958304958",9584308);
        currentAc1.diposit(3939);

        System.out.println(currentAc1.getBalance() + " "+ currentAc1.getAccountNumber());
    }
}
