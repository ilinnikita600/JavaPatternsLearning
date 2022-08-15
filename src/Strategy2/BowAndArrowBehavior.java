package Strategy2;

public class BowAndArrowBehavior implements WeaponBehavior {
    public void fight() {
        System.out.println("Выстрелил из лука во врага");
    }
    @Override
    public String toString() {
        return "Лук";
    }
}
