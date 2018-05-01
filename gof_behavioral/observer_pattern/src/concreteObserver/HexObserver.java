package concreteObserver;

import observer.Observer;
import subject.Subject;

public class HexObserver extends Observer {

  public HexObserver(Subject subject) {
    this.subject = subject;
    this.subject.add(this);
  }

  public void update() {
    System.out.println(" Hex: " + Integer.toHexString(subject.getState()));
  }
}
