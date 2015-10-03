package pattern.iterator_composite;

/**
 * Created by tian on 10/3/15.
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] dinerMenu;
    int posi = 0;
    public DinerMenuIterator(MenuItem[] dinerMenu) {
        this.dinerMenu=dinerMenu;
    }

    @Override
    public boolean hasNext() {
        return posi<dinerMenu.length&&dinerMenu[posi]!=null;
    }

    @Override
    public Object next() {
        return dinerMenu[++posi];
    }
}
