import concreteCommand.FlipUpCommand;
import concreteCommand.FlipDownCommand;
import receiver.Light;
import invoker.Switch;

public class CommandApp {

  public static void main(String[] args) {

    Light light = new Light();
    Switch light_switch = new Switch();

    light_switch.storeAndExecute(new FlipUpCommand(light));
    light_switch.storeAndExecute(new FlipDownCommand(light));
    light_switch.storeAndExecute(new FlipDownCommand(light));
    light_switch.storeAndExecute(new FlipUpCommand(light));
    light_switch.storeAndExecute(new FlipUpCommand(light));
    light_switch.storeAndExecute(new FlipDownCommand(light));

    System.out.println("");

    light_switch.unmake();
    light_switch.unmake();
    light_switch.unmake();
  }
}
