package EksamenVår2019;

public class Oppgave2 {
    public static void main(String[] args) {
        Skatt nyPerson = new Skatt("Per Hansen", "Osloveien 82 0150 Oslo", 400000);
        nyPerson.beregn();
        System.out.println(nyPerson);
    }
}

class Skatt {
    private String navn;
    private String adresse;
    private double lonn;
    private double skatt;

    public Skatt(String navn, String adresse, double lonn) {
        this.navn = navn;
        this.adresse = adresse;
        this.lonn = lonn;
    }

    public void beregn() {
        if (lonn < 50000) {
            this.skatt = 0;
        }
        if (lonn >= 50000 && lonn <= 150000) {
            this.skatt = lonn*0.25;
        }
        if (lonn > 150000) {
            this.skatt = lonn*0.35;
        }
    }

    public String toString() {
        return navn + ", " + adresse + "\n" +
                "Lønn : " + lonn + " Skatt : " + skatt;
    }
}