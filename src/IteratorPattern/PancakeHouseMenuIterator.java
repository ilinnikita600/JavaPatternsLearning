package IteratorPattern;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
    private final ArrayList<MenuItem> menuItems;
    int position = 0;
    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
    public boolean hasNext() {
        return position != menuItems.size();
    }
    public MenuItem next() {
        if (hasNext()) return menuItems.get(position++);
        return null;
    }
}
