package caretaker;

import java.util.ArrayList;

import memento.Memento;

public class Caretaker {
  private ArrayList<Memento> mementos = new ArrayList<Memento>();

  public void addMemento(Memento memento) {
    this.mementos.add(memento);
  }

  public Memento getMemento() {
    return mementos.get(1);
  }
}
