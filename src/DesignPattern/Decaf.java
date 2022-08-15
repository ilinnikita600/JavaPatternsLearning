package DesignPattern;

public class Decaf extends Beverage {
    public Decaf() {
        description = "De Caffeine Coffee";
    }
    public Decaf(Size size) {
        this();
        setSize(size);
    }
    public double cost() {
        return 1.05;
    }
}
