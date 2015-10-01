package pattern.decorator.coffee;

import pattern.decorator.coffee.Beverage;

/**
 * 咖啡-深烘焙
 * Created by tian on 10/1/15.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        desc="Dark Roast(深烘焙)";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
