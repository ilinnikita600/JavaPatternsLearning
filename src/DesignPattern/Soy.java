package DesignPattern;

public class Soy extends CondimentDecorator {
    private final Beverage beverage;

    public Soy(Beverage beverage) {
        setSize(beverage.getSize());
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        double condimentCost = switch (getSize()) {
            case TALL -> 0.05;
            case GRANDE -> 0.10;
            case VENTI -> 0.15;
        };
        return beverage.cost() + condimentCost;
    }
}
