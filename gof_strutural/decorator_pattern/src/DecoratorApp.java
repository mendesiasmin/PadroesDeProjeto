import concreteDecorator.BorderDecorator;
import concreteDecorator.ScrollDecorator;
import concreteComponent.TextField;
import component.Widget;

public class DecoratorApp {

  public static void main(String[] args) {

    Widget widget = new BorderDecorator(new BorderDecorator(new ScrollDecorator(new TextField(80, 24))));
    widget.draw();
  }
}
