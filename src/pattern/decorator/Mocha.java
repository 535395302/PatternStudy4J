package pattern.decorator;

import pattern.decorator.component.Beverage;

/**
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
