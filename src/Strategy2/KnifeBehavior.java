package Strategy2;

public class KnifeBehavior implements WeaponBehavior {
    public void fight() {
        System.out.println("Пырнул противника ножом!");
    }
    @Override
    public String toString() {
        return "Нож";
    }
}
