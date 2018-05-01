import context.Chain;
import concreteState.Off;

public class StateApp {

  public static void main(String[] args) {

    Chain subject = new Chain(new Off());

    subject.pull();
    subject.pull();
    subject.pull();
    subject.pull();
    subject.pull();
  }
}
