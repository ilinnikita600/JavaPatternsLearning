package DesignPattern;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }
    public DarkRoast(Size size) {
        this();
        setSize(size);
    }
    public double cost() {
        return .99;
    }
}
