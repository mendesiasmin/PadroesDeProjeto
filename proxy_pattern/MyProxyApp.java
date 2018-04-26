import proxy.Image;
import proxy.ProxyImage;


public class MyProxyApp {

    public static void main(String[] args) {
      Image image = new ProxyImage("test_image.png");

      // Load image before display
      image.display();
      System.out.println("");

      // Only display image
      image.display();
    }
}
