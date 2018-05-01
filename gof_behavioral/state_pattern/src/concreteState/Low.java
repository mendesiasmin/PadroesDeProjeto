package concreteState;

import state.State;
import context.Chain;
import concreteState.Medium;

public class Low implements State {

  public void pull(Chain subject) {
    subject.setState(new Medium());
    System.out.println("Medium State");
  }
}
