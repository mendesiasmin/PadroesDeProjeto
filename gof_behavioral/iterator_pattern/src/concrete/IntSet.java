package concrete;

import aggregate.Aggregate;
import iterator.Iterator;

public class IntSet implements Aggregate {

  public String set[] = {"15", "28", "36", "47", "54"};

  public class IntIterator implements Iterator {
    private int index;

    public boolean hasNext() {
      if(index < set.length) {
        return true;
      } else {
        return false;
      }
    }

    public String next() {
      if(this.hasNext()) {
        return set[index++];
      } else {
        return null;
      }
    }
  }

  public Iterator createIterator() {
    return new IntIterator();
  }

}
