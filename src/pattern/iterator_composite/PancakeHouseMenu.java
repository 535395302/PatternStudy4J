package pattern.iterator_composite;

import java.util.ArrayList;

/**
 * Created by tian on 10/3/15.
 */
public class PancakeHouseMenu {
    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem("Regular Pancake Breakfast","Pancakes with fried eggs,sausage",2.99,false);
        addItem("Blueberry Pancake","Pancakes made with fresh blueberries",3.49,true);
    }

    public void addItem(String name,String desc,double price,boolean vege) {
        MenuItem item = new MenuItem(name, desc, price, vege);
        menuItems.add(item);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}
