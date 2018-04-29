import factory.CarFactory;
import car.Car;

public class FactoryApp {

  public static void main(String[] args) {

    CarFactory carFactory = new CarFactory();

    Car fox = carFactory.newCar("fox", "AAA-9876");
    fox.informations();

    Car fiorino = carFactory.newCar("fiorino", "BBB-5432");
    fiorino.informations();

    Car agile = carFactory.newCar("agile", "CCC-1098");
    agile.informations();
  }
}
