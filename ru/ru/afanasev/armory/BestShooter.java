package ru.afanasev.armory;

public class BestShooter {
    private String name;
    Weapon weapon;

    public BestShooter(String name) {
        this.name = name;
    }

    public void shooting() {
        if (weapon == null) System.out.println("Я не умею стрелять");
        else {
            weapon.shoot();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

}
