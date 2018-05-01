package concreteObserver;

import observer.Observer;
import subject.Subject;

public class OctObserver extends Observer {

  public OctObserver(Subject subject) {
    this.subject = subject;
    this.subject.add(this);
  }

  public void update() {
    System.out.println(" Oct: " + Integer.toOctalString(subject.getState()));
  }
}
