import concreteCreator.ConcreteCarFactory;
import product.Car;

public class FactoryApp {

  public static void main(String[] args) {

    ConcreteCarFactory carFactory = new ConcreteCarFactory();

    Car fox = carFactory.newCar("fox", "AAA-9876");
    fox.informations();
    System.out.println("");

    Car fiorino = carFactory.newCar("fiorino", "BBB-5432");
    fiorino.informations();
    System.out.println("");

    Car agile = carFactory.newCar("agile", "CCC-1098");
    agile.informations();
    System.out.println("");
  }
}
