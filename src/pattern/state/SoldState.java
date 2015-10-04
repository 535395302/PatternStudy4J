package pattern.state;

/**
 * Created by tian on 10/4/15.
 */
public class SoldState implements State {
    GumballMachine gumballMechine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMechine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Not now..");
    }

    @Override
    public void enjectQuarter() {
        System.out.println("Sorry,you turn crank,no $ return..");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice is not work");
    }

    @Override
    public void dispense() {
        gumballMechine.releaseBall();
        if (gumballMechine.getCount()>0){
            gumballMechine.setState(gumballMechine.getNoQuarterState());
        }else{
            gumballMechine.setState(gumballMechine.getSoldOutState());
            System.out.println("Oops, out of gumballs!!!");
        }
    }
}
