package concreteHandler;

import handler.PurchasePower;

public class PresidentPower extends PurchasePower {

  protected double getAllowable() {
    return BASE*60;
  }

  protected String getRole() {
    return "President";
  }
}
