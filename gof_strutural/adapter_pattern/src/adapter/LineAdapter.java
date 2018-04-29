package adapter;

import target.Shape;
import adaptee.Line;

public class LineAdapter implements Shape {

  private Line line;

  public LineAdapter(Line line) {
    this.line = line;
  }

  public void draw(int x1, int x2, int y1, int y2) {
    line.draw(x1, x2, y1, y2);
  }
}
