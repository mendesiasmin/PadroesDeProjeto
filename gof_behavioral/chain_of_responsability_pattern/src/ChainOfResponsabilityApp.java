import java.util.Scanner;

import client.PurchaseRequest;
import concreteHandler.ManagerPower;
import concreteHandler.PresidentPower;
import concreteHandler.DirectorPower;

public class ChainOfResponsabilityApp {

  public static void main(String[] args) {
    ManagerPower manager = new ManagerPower();
    DirectorPower director = new DirectorPower();
    PresidentPower president = new PresidentPower();

    manager.setSuccessor(director);
    director.setSuccessor(president);

    Scanner scan = new Scanner(System.in);
    double amount = 0;

    while(amount != -1) {
      System.out.println("Enter the amount to check who should approve your expenditure.");
      System.out.print("Amount Value: ");
      amount = scan.nextDouble();
      manager.processRequest(new PurchaseRequest(amount, "General"));
    }
  }
}
