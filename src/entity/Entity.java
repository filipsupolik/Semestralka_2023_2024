package entity;

public class Entity {
    private int hlth;
    private int atck;
    private int def;
    private final Player_Classes playerClasses;

    public Entity(int hlth, int atck, int def, Player_Classes playerClasses) {
        this.hlth = hlth;
        this.atck = atck;
        this.def = def;
        this.playerClasses = playerClasses;
    }

    public int getDef() {
        return this.def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getHlth() {
        return this.hlth;
    }

    public void setHlth(int hlth) {
        this.hlth = hlth;
    }

    public int getAtck() {
        return this.atck;
    }

    public void setAtck(int atck) {
        this.atck = atck;
    }

    public Player_Classes getPlayerClasses() {
        return this.playerClasses;
    }
}
