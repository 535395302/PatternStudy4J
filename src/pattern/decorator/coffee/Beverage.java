package pattern.decorator.coffee;

/**
 * 饮料
 * @author Tian
 * @version 1.0
 * @date 2015-09-30 17:51
 */
public abstract class Beverage {
    public String desc = "Unknown bererage";

    public String getDesc() {
        return desc;
    }

    public abstract double cost();
}
