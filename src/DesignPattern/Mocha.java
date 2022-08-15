package DesignPattern;

public class Mocha extends CondimentDecorator {
    private final Beverage beverage;

    public Mocha(Beverage beverage) {
        setSize(beverage.getSize());
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        double condimentCost = switch (getSize()) {
            case TALL -> 0.10;
            case GRANDE -> 0.15;
            case VENTI -> 0.20;
        };
        return beverage.cost() + condimentCost;
    }
}
