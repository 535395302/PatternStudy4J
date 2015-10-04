package pattern.state;

/**
 * Created by tian on 10/4/15.
 */
public class HasQuarterState implements State {
    GumballMachine gumballMechine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMechine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Already has $0.25");
    }

    @Override
    public void enjectQuarter() {
        gumballMechine.setState(gumballMechine.getNoQuarterState());
        System.out.println("Return $0.25");
    }

    @Override
    public void turnCrank() {
        gumballMechine.setState(gumballMechine.getSoldState());
        System.out.println("You turned...");
    }

    @Override
    public void dispense() {
        System.out.println("Not now..");
    }
}
