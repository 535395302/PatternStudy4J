package pattern.compound.factory;

import pattern.compound.decorator.QuackCounter;
import pattern.compound.domain.DuckCall;
import pattern.compound.domain.MallardDuck;
import pattern.compound.domain.RedheadDuck;
import pattern.compound.domain.RubberDuck;
import pattern.compound.interf.Quackable;

/**
 * @author Tian
 * @version 1.0
 * @date 2016-04-11 18:14
 */
public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }
}
