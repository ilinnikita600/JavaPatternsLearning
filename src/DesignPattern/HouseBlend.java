package DesignPattern;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }
    public HouseBlend(Size size) {
        this();
        setSize(size);
    }

    public double cost() {
        return .89;
    }
}
