package pattern.compound.factory;

import pattern.compound.interf.Quackable;

/**
 * @author Tian
 * @version 1.0
 * @date 2016-04-11 18:08
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createRubberDuck();
    public abstract Quackable createDuckCall();
}
