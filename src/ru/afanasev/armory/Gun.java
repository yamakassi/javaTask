package ru.afanasev.armory;

public class Gun extends Weapon {
    private int maxAmmo;

    public Gun() {
        this(10);
    }

    public Gun(int ammo) {
        this(ammo, ammo);
    }

    public Gun(int ammo, int maxAmmo) {
        super(ammo);

        this.maxAmmo = maxAmmo;
    }

    public void load(int ammo) {
        int ret = 0, tmp = this.ammo + ammo;
        if (tmp > maxAmmo) {
            tmp = maxAmmo;
        }
        this.ammo = tmp;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public void shoot() {
        if (ammo > 0) {
            System.out.println("BAH");
            ammo--;
        } else {
            System.out.println("klac");
        }
    }


    public String toString() {
        return "Gun{" + "ammo=" + ammo + ", maxAmmo=" + maxAmmo + '}';
    }


}
