package concreteStrategy;

import strategy.Payment;

public class CardPayment implements Payment {

  public void pay(double amount) {
    System.out.println("Get machine");
    System.out.println("Digit value");
    System.out.println("Insert card");
    System.out.println("Digit password");
    System.out.println("Wayte confirm");
    System.out.println("Finish card payment: " + amount);
  }
}
