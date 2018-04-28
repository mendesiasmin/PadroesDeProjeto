import creator.LookFactory;
import product.Clothes;
import product.Shoe;

public class AbstractFactoryApp {

  public static void main(String[] args) {

    // Create party look
    LookFactory look = LookFactory.dayLook("party");

    Clothes clothes = look.createClothes();
    Shoe shoe = look.createShoes();
    clothes.fabric();
    shoe.material();
    System.out.println("");

    // Create park look
    look = LookFactory.dayLook("park");

    clothes = look.createClothes();
    shoe = look.createShoes();
    clothes.fabric();
    shoe.material();
    System.out.println("");
  }
}
