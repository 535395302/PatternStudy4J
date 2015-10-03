package pattern.template_method;

/**
 * 咖啡因饮料
 * Created by tian on 10/3/15.
 */
public abstract class CafffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }

    /**
     * 倒入杯子中
     */
    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * 冲泡
     */
    abstract void brew();

    /**
     * 添加调料
     */
    abstract void addCondiments() ;
}
