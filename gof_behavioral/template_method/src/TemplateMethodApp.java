import concrete.Mommy;
import concrete.Father;
import concrete.Son;

public class TemplateMethodApp {

  public static void main(String[] args) {

    Mommy mommy = new Mommy();
    System.out.println("Mommy dayly routine:");
    mommy.routine();

    Father father = new Father();
    System.out.println("\nFather dayly routine:");
    father.routine();

    Son son = new Son();
    System.out.println("\nSon dayly routine:");
    son.routine();
  }
}
