package concreteCommand;

import command.Command;
import receiver.Light;

public class FlipUpCommand implements Command {

  private Light light;

  public FlipUpCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    light.turnOn();
  }
}
