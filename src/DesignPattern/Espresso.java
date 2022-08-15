package DesignPattern;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }
    public Espresso(Size size) {
        this();
        setSize(size);
    }
    public double cost() {
        return 1.99;
    }
}
