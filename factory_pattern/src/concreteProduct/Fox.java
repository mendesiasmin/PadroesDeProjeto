package concreteProduct;

import product.Car;

public class Fox extends Car {

    public Fox(String car_plate) {
      this.car_plate = car_plate;
    }

    public void informations() {
      System.out.println("Wolksvagem Car");
      System.out.println("Car Plate: " + car_plate);
    }
}
