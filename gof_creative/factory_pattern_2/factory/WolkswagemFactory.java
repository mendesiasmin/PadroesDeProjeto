package facotory;

import car.Fox;

public class WolkswagemFactory extends CarFactory {

  public Car createCar(String car_plate) {
    return new Fox(car_plate);
  }
}
