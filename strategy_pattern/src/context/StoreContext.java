package context;

import java.util.ArrayList;
import java.util.List;
import strategy.Payment;

public class StoreContext {

  List<Item> items;
  Payment payment;

  public StoreContext() {
    this.items = new ArrayList<Item>();
  }

  public void setPayment(Payment payment) {
    this.payment = payment;
  }

  public void addItem(Item item) {
    this.items.add(item);
  }

  public void removeItem(Item item) {
    this.items.remove(item);
  }

  public double calculateTotalPrice() {

    double sum = 0;

    for(Item item : items) {
      sum += item.getItemPrice();
    }

    return sum;
  }

  public void pay(){
    double amount = this.calculateTotalPrice();
    this.payment.pay(amount);	
  }
}
