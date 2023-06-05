package entity;

import weapon.Weapon;

public abstract class Entity {
    int hp;
    int peniaze;
    Weapon zbran;

    public Entity(int hp, int peniaze, Weapon zbran) {
        this.hp = hp;
        this.peniaze = peniaze;
        this.zbran = zbran;
    }

    public abstract void attack();

}
