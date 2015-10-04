package pattern.state;

/**
 * Created by tian on 10/4/15.
 */
public class NoQuarterState implements State {
    GumballMachine gumballMechine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMechine = gumballMachine;
    }

    /**
     * 投入25分
     */
    @Override
    public void insertQuarter() {
        System.out.println("Insert $0.25");
        gumballMechine.setState(gumballMechine.getHasQuarterState());
    }

    /**
     * 取回25分
     */
    @Override
    public void enjectQuarter() {
        System.out.println("No $,no return");
    }

    /**
     * 转动曲柄
     */
    @Override
    public void turnCrank() {
        System.out.println("No $,not work");
    }

    /**
     * 发放糖果
     */
    @Override
    public void dispense() {
        System.out.println("No $,no gumball");
    }
}
