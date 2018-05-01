package concreteColleague;

import mediator.Mediator;
import colleague.Colleague;

public class IosColleague extends Colleague {

  public IosColleague(Mediator mediator) {
    super(mediator);
  }

  public void receiveMessage(String message) {
    System.out.println("IOS Receive: " + message);
  }

}

