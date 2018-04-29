package concretePrototype;

import prototype.Prototype;

public class PrototypeBeta implements Prototype {

  private String name = "BetaVersion";

  public String getName() {
    return name;
  }

  public Prototype clone() {
    return new PrototypeBeta();
  }
}
