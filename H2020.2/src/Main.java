import javax.swing.*;
import java.util.List;


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
        return /*Bruk toString som eksisterer i Person*/ "Navn: " + navn + "\nAlder: " + alder + "\nPersonnummer: " + personnummer + "\nDiagnose: " + diagnose;
    }
}
class Lege extends Person{
    Pasient[] pasientListe = new Pasient[100];
    public Lege(String navn, String personnummer, int alder) {
        super(navn, personnummer, alder);
    }
    public String toString() {
        return /*Bruk toString som finnes i Paisent til å skrive ut info*/"Navn: " + navn + "Alder: " + alder + "Personnummer:" + personnummer;
    }
}
public class Main {
    public static void main(String[] args) {
        Pasient Roger = new Pasient("Roger", "12345678910", "Kreft", 65);
        Pasient Per = new Pasient("Per", "10987654321", "Brudd", 21);

        Lege Johannesen = new Lege("Johannesen", "11223344556", 47);
        Johannesen.pasientListe[0] = Roger;
        Johannesen.pasientListe[1] = Per;

        <Skriv ut alle dataene på System.out.print ved hjelp av lege-objektet>
    }
}