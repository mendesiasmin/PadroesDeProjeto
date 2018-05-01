package concreteState;

import state.State;
import context.Chain;
import concreteState.Low;

public class Off implements State {

  public void pull(Chain subject) {
    subject.setState(new Low());
    System.out.println("Low State");
  }
}
