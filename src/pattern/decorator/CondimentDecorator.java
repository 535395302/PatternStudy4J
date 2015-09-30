package pattern.decorator;

import pattern.decorator.component.Beverage;

/**
 * @author Tian
 * @version 1.0
 * @date 2015-09-30 17:57
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDesc();
}
