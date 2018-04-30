package invoker;

import java.util.List;
import java.util.ArrayList;

import command.Command;

public class Switch {

  private List<Command> history = new ArrayList<Command>();

  public void storeAndExecute(Command cmd) {
    this.history.add(cmd);
    cmd.execute();
  }

  public void unmake() {
    System.out.print("Unmake: ");
    history.get(history.size() - 1).execute();
    history.remove(history.size() - 1);
  }

}
