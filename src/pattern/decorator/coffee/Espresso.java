package pattern.decorator.coffee;

import pattern.decorator.coffee.Beverage;

/**
 * 咖啡-浓咖啡，蒸馏咖啡
 * @author Tian
 * @version 1.0
 * @date 2015-09-30 17:59
 */
public class Espresso extends Beverage {
    public Espresso() {
        desc = "Espresso(浓咖啡)";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
