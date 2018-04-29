package concreteCreator;

import creator.LookFactory;
import product.Clothes;
import product.Shoe;
import concreteProduct.Shorts;
import concreteProduct.Sneakers;

public class SportLookFactory extends LookFactory {

  public Clothes createClothes() {
    return new Shorts();
  }

  public Shoe createShoes() {
    return new Sneakers();
  }
}
