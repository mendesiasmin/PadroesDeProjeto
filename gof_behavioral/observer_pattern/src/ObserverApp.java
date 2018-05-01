import java.util.Scanner;

import subject.Subject;
import concreteSubject.ConcreteSubject;
import concreteObserver.HexObserver;
import concreteObserver.BinObserver;
import concreteObserver.OctObserver;

public class ObserverApp {

  public static void main(String[] args) {

    Subject subject = new ConcreteSubject();

    new HexObserver(subject);
    new BinObserver(subject);
    new OctObserver(subject);

    Scanner scan = new Scanner(System.in);

    for(int i = 0; i < 5; i++) {
      System.out.print("New State: ");
      subject.setState(scan.nextInt());
    }
  }
}
