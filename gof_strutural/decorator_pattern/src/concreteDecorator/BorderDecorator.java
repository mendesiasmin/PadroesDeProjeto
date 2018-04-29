package concreteDecorator;

import decorator.Decorator;
import component.Widget;

public class BorderDecorator extends Decorator {

  public BorderDecorator(Widget widget) {
    super(widget);
  }

  public void draw() {
    super.draw();
    System.out.println(" BorderDecorator");
  }
}
