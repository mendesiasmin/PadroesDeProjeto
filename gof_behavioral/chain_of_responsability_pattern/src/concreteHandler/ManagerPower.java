package concreteHandler;

import handler.PurchasePower;

public class ManagerPower extends PurchasePower {

  protected double getAllowable() {
    return BASE*10;
  }

  protected String getRole() {
    return "Manager";
  }
}
