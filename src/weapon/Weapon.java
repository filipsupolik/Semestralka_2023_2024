package weapon;

public enum Weapon {
    SVETELNÝ_MEČ(10, 7),
    BLASTER(6, 8),
    RUKA(1, 100);

    int dmg;
    int pocetPouziti;
    Weapon(int dmg, int pocetPouziti) {
        this.dmg = dmg;
        this.pocetPouziti = pocetPouziti;
    }
}
