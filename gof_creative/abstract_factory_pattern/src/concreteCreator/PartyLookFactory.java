package concreteCreator;

import creator.LookFactory;
import product.Clothes;
import product.Shoe;
import concreteProduct.Skirt;
import concreteProduct.Sandal;

public class PartyLookFactory extends LookFactory {

  public Clothes createClothes() {
    return new Skirt();
  }

  public Shoe createShoes() {
    return new Sandal();
  }
}
