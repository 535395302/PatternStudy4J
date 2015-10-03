package pattern.iterator_composite;

/**
 * Created by tian on 10/3/15.
 */
public class MenuItem {
    private String name;
    private String desc;
    private double price;
    private boolean vegetarian;


    public MenuItem(String name, String desc, double price, boolean vegetarian) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
}
