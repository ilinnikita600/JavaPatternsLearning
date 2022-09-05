package IteratorPattern;

public class Test {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        Iterator<MenuItem> pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        while (pancakeHouseMenuIterator.hasNext()) {
            MenuItem menuItem = pancakeHouseMenuIterator.next();
            System.out.println(menuItem.getDescription());
        }
    }
}
