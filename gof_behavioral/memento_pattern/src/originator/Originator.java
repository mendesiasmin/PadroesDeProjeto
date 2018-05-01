package originator;

import memento.Memento;

public class Originator {
  private String state;

  public void setState(String state) {
    System.out.println("Originator: Setting state to " + state);
    this.state = state;
  }

  public Memento save() {
    System.out.println("Originator: Saving to Memento");
    return new Memento(state);
  }

  public void restore(Memento memento) {
    state = memento.getState();
    System.out.println("Originator: State after restoring from Memento: " + state);
  }
}
