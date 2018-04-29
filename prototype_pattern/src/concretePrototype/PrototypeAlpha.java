package concretePrototype;

import prototype.Prototype;

public class PrototypeAlpha implements Prototype {

  private String name = "AlphaVersion";

  public String getName() {
    return name;
  }

  public Prototype clone() {
    return new PrototypeAlpha();
  }
}
