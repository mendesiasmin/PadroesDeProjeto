package concreteColleague;

import mediator.Mediator;
import colleague.Colleague;

public class AndroidColleague extends Colleague {

  public AndroidColleague(Mediator mediator) {
    super(mediator);
  }

  public void receiveMessage(String message) {
    System.out.println("Android Receive: " + message);
  }

}

