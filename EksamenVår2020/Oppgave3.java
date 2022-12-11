package EksamenVår2020;

public class Oppgave3 {
    public static void main(String[] args) {
        Forfatter herman = new Forfatter("Herman", "130899");
        Bok lotr = new Bok("Lord of the rings", herman);
        Bok starwars = new Bok("Star Wars", herman);
        System.out.println(lotr);
        System.out.println(starwars);
    }
}

class Bok {
    private String tittel;
    private Forfatter forfatter;
    public Bok(String tittel, Forfatter forfatter) {
        this.tittel = tittel;
        this.forfatter = forfatter;
    }
    public String toString() {
        return "Tittel: " + tittel + "\n" +
                "Forfatter: " + "\n" + forfatter;
    }
}

class Forfatter {
    private String navn;
    private String født;

    public Forfatter(String navn, String født) {
        this.navn = navn;
        this.født = født;
    }
    public String toString() {
        return "Navn: " + navn + "\n" +
                "Født: " + født;
    }
}