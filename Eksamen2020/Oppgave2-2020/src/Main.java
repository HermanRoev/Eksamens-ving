public class Main {
    public static void main(String[] args) {
        Pasient ludvig = new Pasient("Ludvig", "10101022233", 21, "Blind");
        Pasient selmer = new Pasient("James", "14141429309", 19, "Feber");

        Lege herman = new Lege("Herman", "13089933913", 23);
        herman.pasientliste[0] = ludvig;
        herman.pasientliste[1] = selmer;

        for (Pasient i : herman.pasientliste) {
            if (i != null) {
                System.out.println(i.toString());
            }
        }
    }
}

class Person{
    private String navn;
    private String personnummer;
    private int alder;
    public Person(String navn, String personnummer, int alder) {
        this.navn = navn;
        this.personnummer = personnummer;
        this.alder = alder;
    }

    public String toString() {
        return  "Navn: " + navn + "\n" +
                "Personnummer: " + personnummer + "\n" +
                "Alder: " + alder;
    }

}
class Pasient extends Person{
    private String diagnose;

    public Pasient(String navn, String personnummer, int alder, String diagnose) {
        super(navn, personnummer, alder);
        this.diagnose = diagnose;
    }
   public String toString() {
        return super.toString() + "\n" + "Diagnose: " + diagnose;
   }
}
class Lege extends Person{
    Pasient[] pasientliste = new Pasient[100];
    public Lege(String navn, String personnummmer, int alder) {
        super(navn, personnummmer, alder);
    }
    public String toString() {
        return pasientliste.toString();
    }
}


