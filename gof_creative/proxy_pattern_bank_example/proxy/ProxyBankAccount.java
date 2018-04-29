package proxy;

import proxy.RealBankAccount;


public class ProxyBankAccount implements BankAccount {

    private RealBankAccount account;

    public ProxyBankAccount(Integer balance) {
        account = new RealBankAccount(balance);
        System.out.println("[LOG] Create new account.");
    }

    public int getBalance() {
        System.out.println("[LOG] User consulted your account.");
        return account.getBalance();
    }

    public void updateBalance(int value) {
        account.updateBalance(value);
        System.out.println("[LOG] User updated your account.");
    }
}
