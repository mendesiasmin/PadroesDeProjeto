package concreteCreator;

import creator.CarFactory;
import product.Car;
import concreteProduct.Agile;
import concreteProduct.Fox;
import concreteProduct.Fiorino;

public class ConcreteCarFactory extends CarFactory {

  public Car newCar(String model, String car_plate) {
    switch(model) {
      case "fox":
        return new Fox(car_plate);
      case "agile":
        return new Agile(car_plate);
      case "fiorino":
        return new Fiorino(car_plate);
      default:
        return null;
    }
  }
}

