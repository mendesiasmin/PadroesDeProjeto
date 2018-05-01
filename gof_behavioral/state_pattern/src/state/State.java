package state;

import context.Chain;

public interface State {
  public void pull(Chain subject);
}
