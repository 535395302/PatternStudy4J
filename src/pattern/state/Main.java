package pattern.state;

public class Main {

    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(5);

        machine.insertQuarter();
        machine.turnCrank();
        machine.dispense();

        System.out.println("------------------");

        machine.insertQuarter();
        machine.enjectQuarter();
        machine.turnCrank();
        machine.dispense();

        System.out.println("------------------");

        machine.dispense();
        machine.insertQuarter();
        machine.enjectQuarter();
        machine.turnCrank();
        machine.dispense();

        System.out.println("============");
        while(machine.getCount()>0){
            machine.insertQuarter();
            machine.turnCrank();
            machine.dispense();
        }
        System.out.println(machine.getCount());

        System.out.println("~~~~~~~~~~~~~~");
        machine.insertQuarter();
        machine.turnCrank();
        machine.dispense();
    }
}
