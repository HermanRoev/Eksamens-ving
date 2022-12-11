package EksamenVår2022;

import java.util.ArrayList;

public class Oppgave2 {
    public static void main(String[] args) {

    }
}

class Valuta{
    private String valuta;
    private double kurs;
    public Valuta(String valuta, double kurs) {
        this.valuta = valuta;
        this.kurs = kurs;
    }
    public String getValuta() {
        return valuta;
    }
    public double getKurs() {
        return kurs;
    }
}

