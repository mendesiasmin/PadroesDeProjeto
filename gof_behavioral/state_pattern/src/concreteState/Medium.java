package concreteState;

import state.State;
import context.Chain;
import concreteState.High;

public class Medium implements State {

  public void pull(Chain subject) {
    subject.setState(new High());
    System.out.println("High State");
  }
}
