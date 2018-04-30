import strategy.Payment;
import concreteStrategy.CashPayment;
import concreteStrategy.CardPayment;
import context.Item;
import context.StoreContext;


public class StrategyApp {


  public static void main(String[] args) {


    StoreContext storeContext;

    Item lego = new Item("1234", 100.56);
    Item arduino = new Item("5678", 34.00);
    Item camera = new Item("1234", 200.00);
    Item cellphone = new Item("5678", 180.55);

    System.out.println("\n Paying by Card:");
    storeContext = new StoreContext();
    storeContext.setPayment(new CardPayment());
    storeContext.addItem(lego);
    storeContext.addItem(arduino);
    storeContext.pay();

    System.out.println("\n Paying by Cash:");
    storeContext = new StoreContext();
    storeContext.setPayment(new CashPayment());
    storeContext.addItem(lego);
    storeContext.addItem(camera);
    storeContext.addItem(cellphone);
    storeContext.pay();

  }
}
