import fri.shapesge.Obdlznik;
import fri.shapesge.Obrazok;

public class Policko {
    private String farba;
    Obrazok obrazok;
    Obdlznik pozadie;
    int x;
    int y;
    int velkostPolicka;

    public Policko(int x, int y, int velkostPolicka) {
        this.farba = "black";
        this.x = x;
        this.y = y;
        this.velkostPolicka = velkostPolicka;

        this.pozadie = new Obdlznik(this.x, this.y);
        this.pozadie.zmenStrany(velkostPolicka, velkostPolicka);
        this.pozadie.zmenFarbu(this.farba);
        this.pozadie.zobraz();
    }

    public void zmenFarbuPolicka(String novaFarba) {
        this.pozadie.zmenFarbu(novaFarba);
    }

    public void nastavObrazokPolicka(String cestaKObrazku) {
        this.obrazok = new Obrazok(cestaKObrazku, this.x + 10, this.y + 10);
        this.obrazok.zobraz();
    }
}
