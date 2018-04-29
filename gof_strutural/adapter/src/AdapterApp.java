import target.Shape;
import adaptee.Line;
import adaptee.Rectangle;
import adapter.LineAdapter;
import adapter.RectangleAdapter;

public class AdapterApp {

  public static void main(String[] args) {

    Shape[] shapes = { new RectangleAdapter(new Rectangle()),
                       new LineAdapter(new Line())};

    int x1 = 10;
    int y1 = 20;
    int x2 = 30;
    int y2 = 60;

    for (Shape shape : shapes) {
      shape.draw(x1, y1, x2, y2);
    }

  }
}
