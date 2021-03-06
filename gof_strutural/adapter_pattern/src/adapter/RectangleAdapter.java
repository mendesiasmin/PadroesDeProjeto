package adapter;

import target.Shape;
import adaptee.Rectangle;

public class RectangleAdapter implements Shape {

  private Rectangle rectangle;

  public RectangleAdapter(Rectangle rectangle) {
    this.rectangle = rectangle;
  }

  public void draw(int x1, int x2, int y1, int y2) {
    int x = Math.min(x1, x2);
    int y = Math.min(y1, y2);
    int width = Math.abs(x2 - x1);
    int height = Math.abs(y2 - y1);
    rectangle.draw(x, y, width, height);
  }
}
