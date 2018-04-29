import prototype.Prototype;
import concretePrototype.PrototypeAlpha;
import concretePrototype.PrototypeBeta;
import java.util.Hashtable;

public class PrototypeApp {

  private static Hashtable <String, Prototype> map = new Hashtable <String, Prototype>();

  private static void addPrototype(Prototype prototype) {
    map.put(prototype.getName(), prototype);
  }

  private static Prototype createPrototype(String name) {
    Prototype prototype = map.get(name);

    if(prototype == null) {
      System.out.println(name + ": doesn't exist");
      return null;
    } else {
      return prototype.clone();
    }
  }

  public static void initializePrototypes() {
    addPrototype(new PrototypeAlpha());
    addPrototype(new PrototypeBeta());
  }

  public static void main(String[] args) {

    initializePrototypes();

    Prototype prototype = createPrototype("AlphaVersion");
    if(prototype != null) {
      map.put(prototype.getName(), prototype);
      System.out.println(prototype.getName() + ": created successfully");
    }

    prototype = createPrototype("OmegaVersion");
    if(prototype != null) {
      map.put(prototype.getName(), prototype);
      System.out.println(prototype.getName() + ": created successfully");
    }

    prototype = createPrototype("BetaVersion");
    if(prototype != null) {
      map.put(prototype.getName(), prototype);
      System.out.println(prototype.getName() + ": created successfully");
    }
  }
}
