package colleague;

import mediator.Mediator;

public abstract class Colleague {

  protected Mediator mediator;

  public Colleague(Mediator mediator) {
    this.mediator = mediator;
  }

  public void sendMessage(String message) {
    mediator.send(message, this);
  }

  public abstract void receiveMessage(String message);

}

