package pattern.decorator.component;

/**
 * @author Tian
 * @version 1.0
 * @date 2015-09-30 17:59
 */
public class Espresso extends Beverage {
    public Espresso() {
        desc = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
