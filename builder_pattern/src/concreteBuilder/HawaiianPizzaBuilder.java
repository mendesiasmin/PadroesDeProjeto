package concreteBuilder;

import builder.PizzaBuilder;

public class HawaiianPizzaBuilder extends PizzaBuilder {

  public void buildDough() {
    pizza.setDough("cross");
  }

  public void buildTopping() {
    pizza.setTopping("ham, pineapple");
  }

  public void buildSauce() {
    pizza.setSauce("mild");
  }
}
