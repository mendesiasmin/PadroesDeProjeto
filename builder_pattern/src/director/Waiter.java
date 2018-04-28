package director;

import builder.PizzaBuilder;
import product.Pizza;

public class Waiter {

  private PizzaBuilder builder;

  public void setBuilder(PizzaBuilder builder) {
      this.builder = builder;
  }

  public Pizza getPizza() {
    return builder.getPizza();
  }

  public void constructPizza() {
    builder.createNewPizza();
    builder.buildDough();
    builder.buildSauce();
    builder.buildTopping();
  }
}
