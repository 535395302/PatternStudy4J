package pattern.template_method;

/**
 * Created by tian on 10/3/15.
 */
public class Tea extends CafffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
