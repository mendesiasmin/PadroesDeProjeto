package leaf;

import component.AbstractFile;

public class Picture implements AbstractFile {

  private String name;

  public Picture(String name) {
    this.name = name;
  }

  public void ls() {
    System.out.println("Picture: " + name);
  }
}
