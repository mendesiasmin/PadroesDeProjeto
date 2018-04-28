package concreteProduct;

import product.Car;

public class Agile extends Car {

    public Agile(String car_plate) {
      this.car_plate = car_plate;
    }

    public void informations() {
      System.out.println("Chevrolet Car");
      System.out.println("Car Plate: " + car_plate);
    }
}
