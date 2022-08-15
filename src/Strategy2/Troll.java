package Strategy2;

public class Troll extends Character {
    public Troll() {
        weaponBehavior = new AxeBehavior();
    }
}
