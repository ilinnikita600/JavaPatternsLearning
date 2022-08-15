package DesignPattern;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.printf("%s $%.2f%n", beverage.getDescription(), beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.printf("%s $%.2f%n", beverage2.getDescription(), beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.printf("%s $%.2f%n", beverage3.getDescription(), beverage3.cost());

        Beverage beverage4 = new Decaf(Beverage.Size.GRANDE);
        beverage4 = new Soy(beverage4);
        beverage4 = new Soy(beverage4);
        beverage4 = new Mocha(beverage4);
        beverage4 = new Whip(beverage4);
        System.out.printf("%s %s $%.2f%n", beverage4.getDescription(), beverage4.getSize(), beverage4.cost());
    }
}
