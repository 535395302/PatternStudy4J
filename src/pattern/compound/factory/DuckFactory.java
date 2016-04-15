package pattern.compound.factory;

import pattern.compound.domain.DuckCall;
import pattern.compound.domain.MallardDuck;
import pattern.compound.domain.RedheadDuck;
import pattern.compound.domain.RubberDuck;
import pattern.compound.interf.Quackable;

/**
 * 创建没有装饰者的鸭子
 * @author Tian
 * @version 1.0
 * @date 2016-04-11 18:12
 */
public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }
}
