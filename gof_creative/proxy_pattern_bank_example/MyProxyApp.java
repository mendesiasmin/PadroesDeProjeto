import proxy.BankAccount;
import proxy.ProxyBankAccount;


public class MyProxyApp {

    public static void main(String[] args) {
        BankAccount account = new ProxyBankAccount(100);

        //Get balance
        System.out.println(account.getBalance() + "\n");

        //Update Balance
        account.updateBalance(-10);

        System.out.println(account.getBalance());

    }
}
