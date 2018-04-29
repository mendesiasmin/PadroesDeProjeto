import singleton.SingleObject;

public class SingletonApp {

  public static void main(String[] args) {

    SingleObject singleton = SingleObject.getInstance();

    singleton.showMessage();

  }
}
