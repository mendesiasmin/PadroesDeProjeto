import director.Waiter;
import builder.PizzaBuilder;
import concreteBuilder.HawaiianPizzaBuilder;
import concreteBuilder.SpicyPizzaBuilder;

public class BuilderApp {

  public static void main(String[] args) {

    Waiter waiter = new Waiter();
    PizzaBuilder hawaiian = new HawaiianPizzaBuilder();
    PizzaBuilder spicy = new SpicyPizzaBuilder();

    waiter.setBuilder(hawaiian);
    waiter.constructPizza();
    waiter.getPizza().informations();
    System.out.println("");

    waiter.setBuilder(spicy);
    waiter.constructPizza();
    waiter.getPizza().informations();
    System.out.println("");

  }
}
