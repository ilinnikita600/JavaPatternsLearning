package Strategy2;

public abstract class Character {
    protected WeaponBehavior weaponBehavior;
    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        System.out.println("Произошла смена оружия на " + weaponBehavior);
        this.weaponBehavior = weaponBehavior;
    }
}
