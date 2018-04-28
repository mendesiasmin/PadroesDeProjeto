package creator;

import concreteCreator.PartyLookFactory;
import concreteCreator.SportLookFactory;
import product.Clothes;
import product.Shoe;

public abstract class LookFactory {

  public static LookFactory dayLook(String event) {
    switch(event) {
      case "party":
        return new PartyLookFactory();
      case "park":
        return new SportLookFactory();
      default:
        return null;
    }
  }

  public abstract Clothes createClothes();
  public abstract Shoe createShoes();

}
