package concreteAbstraction;

import abstraction.Stack;
import implementor.StackImplementor;
import concreteImplementor.StackList;

public class StackFifo extends Stack {

  private StackImplementor stackImpl = new StackList();

  public StackFifo() {
    super("array");
  }

  public StackFifo(String s) {
    super(s);
  }

  public int pop(int in) {

    while(!isEmpty()) {
      stackImpl.push(super.pop());
    }

    int ret = stackImpl.pop();

    while(!stackImpl.isEmpty()) {
      push(stackImpl.pop());
    }

    return ret;
  }
}
