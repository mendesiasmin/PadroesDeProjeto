import concreteMediator.ConcreteMediator;
import concreteColleague.AndroidColleague;
import concreteColleague.IosColleague;

public class MediatorApp {

  public static void main(String[] args) {
    ConcreteMediator mediator = new ConcreteMediator();

    AndroidColleague android = new AndroidColleague(mediator);
    IosColleague ios = new IosColleague(mediator);

    mediator.addColleague(android);
    mediator.addColleague(ios);

    android.sendMessage("Hi Collegues, I'm Android");
    ios.sendMessage("Hi Collegues, I'm IOS");
  }
}
