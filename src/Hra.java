import entity.Entity;
import entity.Mage;
import entity.Player_Classes;

public class Hra {
    private Mage mage;

    public Hra() {
        this.mage = new Mage(100, 100, 100, 100, "oheň", Player_Classes.MAGE);
        this.testMetoda();
    }

    public void testMetoda() {
        System.out.println("Atck " + mage.getAtck() + " Def " + mage.getDef() + " Hlth " + mage.getHlth() + " Mana " + mage.getMana() + " Druh magie " + mage.getDruhMagie());
    }
}
