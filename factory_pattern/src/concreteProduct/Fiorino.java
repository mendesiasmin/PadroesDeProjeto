package concreteProduct;

import product.Car;

public class Fiorino extends Car {

    public Fiorino(String car_plate) {
      this.car_plate = car_plate;
    }

    public void informations() {
      System.out.println("Fiat Car");
      System.out.println("Car Plate: " + car_plate);
    }
}
