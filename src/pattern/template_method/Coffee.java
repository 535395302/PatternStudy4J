package pattern.template_method;

/**
 * Created by tian on 10/3/15.
 */
public class Coffee extends CafffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Suger and Milk");
    }
}
