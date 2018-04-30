package abstractClass;

public abstract class DailyRoutine {

  // TemplateMethod
  public void routine() {
    wake_up();
    breakfast();
    work();
    dinner();
    sleep();
  }

  //Primitive operations
  public abstract void work();

  public void wake_up() {
    System.out.println("Wake up!");
  }
  public void breakfast() {
    System.out.println("Breakfast");
  }

  public void dinner() {
    System.out.println("Dinner");
  }

  public void sleep() {
    System.out.println("Sleep");
  }

}
