package context;

import state.State;

public class Chain {

  private State state;

  public Chain(State state) {
    setState(state);
  }

  public void setState(State state) {
    this.state = state;
  }

  public void pull() {
    state.pull(this);
  }
}
