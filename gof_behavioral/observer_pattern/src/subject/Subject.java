package subject;

import java.util.List;
import java.util.ArrayList;

import observer.Observer;

public abstract class Subject {

  protected List<Observer> observers = new ArrayList<Observer>();

  public void add(Observer observer) {
    this.observers.add(observer);
  }

  public void remove(Observer observer) {
    this.observers.remove(observer);
  }

  public abstract int getState();
  public abstract void setState(int state);

  protected void execute() {
    for(Observer observer : observers) {
      observer.update();
    }
  }
}
