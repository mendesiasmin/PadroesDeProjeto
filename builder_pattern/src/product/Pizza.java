package product;

public class Pizza {

  private String dough;
  private String sauce;
  private String topping;

  public void setDough(String dough) {
    this.dough = dough;
  }

  public void setSauce(String sauce) {
    this.sauce = sauce;
  }

  public void setTopping(String topping) {
    this.topping = topping;
  }

  public void informations() {
    System.out.println("Dough: " + dough);
    System.out.println("Sauce: " + sauce);
    System.out.println("Topping: " + topping);
  }

}
