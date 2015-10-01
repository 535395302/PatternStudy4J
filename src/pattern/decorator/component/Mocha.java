package pattern.decorator.component;

import pattern.decorator.CondimentDecorator;
import pattern.decorator.coffee.Beverage;

/**
 * 配料-摩卡
 * @author Tian
 * @version 1.0
 * @date 2015-09-30 18:03
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc()+", Mocha";
    }

    @Override
    public double cost() {
        return 0.2+beverage.cost();
    }
}
