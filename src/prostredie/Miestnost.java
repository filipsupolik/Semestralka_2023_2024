package prostredie;

import predmety.Karta;
import zive_bytosti.ZiveBytosti;

import java.util.Optional;

public class Miestnost {
    private ZiveBytosti bytosti;
    private Karta karta;

    public Miestnost() {
        this.bytosti = null;
        this.karta = null;
    }

    public Optional<ZiveBytosti> getBytosti() {
        return Optional.ofNullable(this.bytosti);
    }

    public void setBytosti(ZiveBytosti bytosti) {
        if (this.bytosti != null || this.karta != null) {
            System.out.println("Tato miestnost je obsadena, nemozem pridat bytost");
        }
        this.bytosti = bytosti;
    }
}
