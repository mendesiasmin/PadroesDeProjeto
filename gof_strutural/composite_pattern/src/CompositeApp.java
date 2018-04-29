import component.AbstractFile;
import composite.Directory;
import leaf.File;
import leaf.Picture;

public class CompositeApp {

  public static void main(String[] args) {

    Directory folder = new Directory();

    folder.add(new File("patterns.txt"));
    folder.add(new Picture("image.png"));
    folder.add(new File("design.pdf"));
    folder.add(new Picture("image_2.png"));
    folder.add(new Picture("image_3.png"));

    folder.ls();
  }

}
