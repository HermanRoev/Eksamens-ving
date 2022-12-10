import javax.swing.*;

class Person {
    private String navn;
    private String personnummer;
    private int alder;

    public Person(String navn, String personnummer, int alder) {
        this.navn = navn;
        this.alder = alder;
        this.personnummer = personnummer;
    }

    public String toString() {
        return "Navn: " + navn + "Alder: " + alder + "Personnummer:" + personnummer;
    }
}
class Pasient extends Person {
    private String diagnose;

    public Pasient(String navn, String personnummer, String diagnose, int alder) {
        super(navn, personnummer, alder);
        this.diagnose = diagnose;

    }
    public String toString() {
        return super.toString() + "\nDiagnose: " + diagnose;
    }
}
class Lege extends Person{
    Pasient[] pasientListe = new Pasient[100];
    public Lege(String navn, String personnummer, int alder) {
        super(navn, personnummer, alder);
    }
    public String toString() {
        return super.toString();
    }
}
public class Main {
    public static void main(String[] args) {
        Pasient roger = new Pasient("Roger", "12345678910", "Kreft", 65);
        Pasient per = new Pasient("Per", "10987654321", "Brudd", 21);

        Lege johannesen = new Lege("Johannesen", "11223344556", 47);
        johannesen.pasientListe[0] = roger;
        johannesen.pasientListe[1] = per;

        /*<Skriv ut alle dataene på System.out.print ved hjelp av lege-objektet>*/
    }
}