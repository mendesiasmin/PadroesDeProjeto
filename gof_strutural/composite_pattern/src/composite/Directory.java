package composite;

import java.util.ArrayList;
import java.util.List;

import component.AbstractFile;

public class Directory implements AbstractFile {

  private List <AbstractFile> files = new ArrayList<AbstractFile>();

  public void add(AbstractFile file) {
    this.files.add(file);
  }

  public void remove(AbstractFile file) {
    this.files.remove(file);
  }

  public void ls() {
    for(AbstractFile file : files) {
      file.ls();
    }
  }
}
