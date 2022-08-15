package DesignPattern;

public class Whip extends CondimentDecorator {
    private final Beverage beverage;

    public Whip(Beverage beverage) {
        setSize(beverage.getSize());
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        double condimentCost = switch (getSize()) {
            case TALL -> 0.03;
            case GRANDE -> 0.06;
            case VENTI -> 0.10;
        };
        return beverage.cost() + condimentCost;
    }
}
