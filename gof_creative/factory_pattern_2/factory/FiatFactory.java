package factory;

import car.Fiorino;

public class FiatFactory extends CarFactory {

  public Car createCar(String car_plate) {
    return new Fiorino(car_plate);
  }
}
