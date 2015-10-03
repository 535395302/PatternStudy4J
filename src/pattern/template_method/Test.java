package pattern.template_method;

/**
 * Created by tian on 10/3/15.
 */
public class Test {
    public static void main(String... args){
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

        Tea tea = new Tea();
        tea.prepareRecipe();
    }
}
