package Strategy2;

public class AxeBehavior implements WeaponBehavior {
    public void fight() {
        System.out.println("Замахнулся топором во врага!");
    }
    @Override
    public String toString() {
        return "Топор";
    }
}
