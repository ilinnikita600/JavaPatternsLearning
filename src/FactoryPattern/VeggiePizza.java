package FactoryPattern;

public class VeggiePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;
    public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        veggies = pizzaIngredientFactory.createVeggies();
    }
}
