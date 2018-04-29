package proxy;

public class RealBankAccount implements BankAccount {

    private int balance;

    public RealBankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }

    public void updateBalance(int value) {
        this.balance = this.balance + value;
    }

}
