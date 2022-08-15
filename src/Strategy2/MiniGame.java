package Strategy2;

public class MiniGame {
    public static void main(String[] args) {
        Queen queen = new Queen();
        King king = new King();
        Troll troll = new Troll();
        Knight knight = new Knight();
        queen.weaponBehavior.fight();
        queen.setWeaponBehavior(new KnifeBehavior());
        queen.weaponBehavior.fight();
    }
}
