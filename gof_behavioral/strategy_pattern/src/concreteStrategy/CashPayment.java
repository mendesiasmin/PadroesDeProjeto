package concreteStrategy;

import strategy.Payment;

public class CashPayment implements Payment {

  public void pay(double amount) {
    System.out.println("Get cash");
    System.out.println("Calculate transshipment");
    System.out.println("Give transshipment");
    System.out.println("Finish cash payment: " + amount);
  }
}
