package concreteBuilder;

import builder.PizzaBuilder;

public class SpicyPizzaBuilder extends PizzaBuilder {

  public void buildDough() {
    pizza.setDough("pan baked");
  }

  public void buildTopping() {
    pizza.setTopping("pepperoni, salami");
  }

  public void buildSauce() {
    pizza.setSauce("hot");
  }
}
