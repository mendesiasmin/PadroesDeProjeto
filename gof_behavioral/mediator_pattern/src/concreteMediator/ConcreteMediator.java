package concreteMediator;

import java.util.ArrayList;

import colleague.Colleague;
import mediator.Mediator;
import concreteColleague.IosColleague;
import concreteColleague.AndroidColleague;

public class ConcreteMediator implements Mediator {

  protected ArrayList<Colleague> contacts;

  public ConcreteMediator() {
    this.contacts = new ArrayList<Colleague>();
  }

  public void addColleague(Colleague colleague) {
    this.contacts.add(colleague);
  }

  public void send(String message, Colleague colleague) {
    for(Colleague contact : contacts) {
      if(contact != colleague) {
        if(protocolDefine(contact)) {
          contact.receiveMessage(message);
        }
      }
    }
  }

  public boolean protocolDefine(Colleague contact) {
    if(contact instanceof IosColleague) {
      System.out.println("IOS PROTOCOL");
      return true;
    } else if(contact instanceof AndroidColleague) {
      System.out.println("ANDROID PROTOCOL");
      return true;
    } else {
      System.out.println("UNDEFINED PROTOCOL");
      return false;
    }
  }

}
