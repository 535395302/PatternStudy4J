package pattern.state;

/**
 * Created by tian on 10/4/15.
 */
public class SoldOutState implements State {
    GumballMachine gumballMechine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMechine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Sold out...");
    }

    @Override
    public void enjectQuarter() {
        System.out.println("Sold out...");
    }

    @Override
    public void turnCrank() {
        System.out.println("Sold out...");
    }

    @Override
    public void dispense() {
        System.out.println("Sold out...");
    }
}
