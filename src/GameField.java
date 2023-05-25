public class GameField {
    final int VELKOST_POLICKA = 70;
    Policko[][] hernePole;


    public GameField(int pocetPolicok) {
        this.hernePole = new Policko[pocetPolicok][pocetPolicok];
        for (int i = 0; i < pocetPolicok; i++){
            for (int j = 0; j < pocetPolicok; j++) {
                this.hernePole[i][j] = new Policko(i * VELKOST_POLICKA, j * VELKOST_POLICKA, VELKOST_POLICKA);
                this.hernePole[0][0].zmenFarbuPolicka("white");
                this.hernePole[0][0].nastavObrazokPolicka("star_wars_luke_skywalker.png");
            }
        }
    }
}
