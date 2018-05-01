package concreteState;

import state.State;
import context.Chain;
import concreteState.Off;

public class High implements State {

  public void pull(Chain subject) {
    subject.setState(new Off());
    System.out.println("Off State");
  }
}
