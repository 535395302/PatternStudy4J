package pattern.decorator.coffee;

import pattern.decorator.coffee.Beverage;

/**
 * 咖啡-深烘焙
 * Created by tian on 10/1/15.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
    }

    @Override
    public String getDesc() {
        return "Dark Roast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
