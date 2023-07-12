package entity;

public class Mage extends Entity {
    private int mana;

    private String druhMagie;

    public Mage(int hlth, int atck, int def, int mana, String druhMagie,Player_Classes playerClasses) {
        super(hlth, atck, def, playerClasses);
        this.druhMagie = druhMagie;
        if (this.druhMagie == "oheň") {
            this.setHlth(60);
            this.mana = 80;
            this.setAtck(50);
        } else if (this.druhMagie == "ľad") {
            this.setHlth(50);
            this.mana = 60;
            this.setAtck(80);
        } else if (this.druhMagie == "čistá"){
            this.setHlth(70);
            this.mana = 100;
            this.setAtck(20);
        }
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getDruhMagie() {
        return druhMagie;
    }

    public void setDruhMagie(String druhMagie) {
        this.druhMagie = druhMagie;
    }
}
