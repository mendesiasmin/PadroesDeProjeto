package mediator;

import colleague.Colleague;

public interface Mediator {
  void send(String message, Colleague colleague);
}
