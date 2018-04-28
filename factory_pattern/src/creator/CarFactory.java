package creator;

import product.Car;

public abstract class CarFactory {

  public abstract Car newCar(String model, String car_plate);

  // Other interested methods to Car

}

