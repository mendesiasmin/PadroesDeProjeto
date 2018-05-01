import iterator.Iterator;
import concrete.IntSet;

public class IteratorApp {

  public static void main(String[] args) {

      IntSet set = new IntSet();

      for(Iterator iterator = set.createIterator(); iterator.hasNext();) {
        System.out.println("Number: " + iterator.next());
      }
  }
}
