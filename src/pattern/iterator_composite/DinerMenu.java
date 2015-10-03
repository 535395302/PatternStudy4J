package pattern.iterator_composite;

/**
 * Created by tian on 10/3/15.
 */
public class DinerMenu {
    private MenuItem[] menuItems;
    private static final int MAX_ITEMS = 6;
    int numberOfItems = 0;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT","(Fakin') Bacon with lettuce & tamato on whole wheat",true,2.99);
        addItem("Hotdog","A hot dog,with saurkraut,relish,onions",false,3.99);
    }

    public void addItem(String name, String desc, boolean vege, double price) {
        if (MAX_ITEMS<=numberOfItems) {
            System.err.println("Sorry,menu is full! Can't add item to menu");
        }else{
            menuItems[numberOfItems++] = new MenuItem(name, desc, price, vege);
        }
    }

    public DinerMenuIterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
