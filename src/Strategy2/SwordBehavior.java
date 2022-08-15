package Strategy2;

public class SwordBehavior implements WeaponBehavior {
    public void fight() {
        System.out.println("Замахнулся мечом в противника!");
    }
    @Override
    public String toString() {
        return "Меч";
    }
}
