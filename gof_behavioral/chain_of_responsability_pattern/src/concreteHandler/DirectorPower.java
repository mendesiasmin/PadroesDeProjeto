package concreteHandler;

import handler.PurchasePower;

public class DirectorPower extends PurchasePower {

  protected double getAllowable() {
    return BASE*20;
  }

  protected String getRole() {
    return "Director";
  }
}
