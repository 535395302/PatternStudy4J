package pattern.decorator.component;

/**
 * @author Tian
 * @version 1.0
 * @date 2015-09-30 18:01
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        desc = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
