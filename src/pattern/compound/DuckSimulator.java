package pattern.compound;

import pattern.compound.adapter.GooseAdapter;
import pattern.compound.composite.Flock;
import pattern.compound.decorator.QuackCounter;
import pattern.compound.domain.*;
import pattern.compound.factory.AbstractDuckFactory;
import pattern.compound.factory.CountingDuckFactory;
import pattern.compound.interf.Quackable;
import pattern.compound.observable.Quackologist;

/**
 * @author Tian
 * @version 1.0
 * @date 2016-04-11 17:14
 */
public class DuckSimulator {
    public static void main(String[] args) {
        final DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {

        final Quackable mallardDuck = duckFactory.createMallardDuck();
        final Quackable redheadDuck = duckFactory.createRedheadDuck();
        final Quackable rubberDuck  = duckFactory.createRubberDuck();
        final Quackable duckCall    = duckFactory.createDuckCall();

        final Quackable gooseDuck   = new GooseAdapter(new Goose());

        final Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(duckCall);
        //flockOfDucks.add(gooseDuck);

        final Flock flockOfMallards = new Flock();
        flockOfMallards.add(duckFactory.createMallardDuck());
        flockOfMallards.add(duckFactory.createMallardDuck());
        flockOfMallards.add(duckFactory.createMallardDuck());
        flockOfMallards.add(duckFactory.createMallardDuck());

        flockOfDucks.add(flockOfMallards);

        System.out.println("Duck Simulator: With Observer");
        final Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);
        simulate(flockOfDucks);


        System.out.println("total: " + QuackCounter.getNumberOfQuacks() + " times!");
    }
    public void simulate(Quackable duck) {
        duck.quack();
    }
}
