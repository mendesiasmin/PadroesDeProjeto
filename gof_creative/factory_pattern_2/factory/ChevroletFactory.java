package factory;

import car.Agile;

public class ChevroletFactory extends CarFactory {

  public Car createCar(String car_plate) {
    return new Agile(car_plate);
  }
}
