package factory;

import car.Car;
import car.Agile;
import car.Fox;
import car.Fiorino;

public abstract class CarFactory {

  // FactoryMethod
  abstract protected Car createCar(String car_plate);

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

