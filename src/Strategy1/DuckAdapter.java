package Strategy1;

public class DuckAdapter implements Turkey {
    private final Duck duck;
    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }
    public void gobble() {
        duck.performQuack();
    }
    public void fly() {
        duck.performFly();
        System.out.println("Stop in 1 second");
    }
}
