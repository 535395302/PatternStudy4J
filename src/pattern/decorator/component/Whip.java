package pattern.decorator.component;

import pattern.decorator.CondimentDecorator;
import pattern.decorator.coffee.Beverage;

/**
 * 配料-奶泡、奶油
 * Created by tian on 10/1/15.
 */
public class Whip extends CondimentDecorator {
    private Beverage beverage;

    @Override
    public double cost() {
        return beverage.cost()+.10;
    }

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc()+", whip(奶油)";
    }
}
