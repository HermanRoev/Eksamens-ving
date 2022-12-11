import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> liste = new ArrayList<>();
        Student herman = new Student("Herman", "Svingen 2", "40404040", "9994949", "IT");
        Ansatt per = new Ansatt("Per", "Toppen 4", "10101010", "OsloMet", "500000");
        liste.add(herman);
        liste.add(per);
        for (Person i : liste) {
            System.out.println(i);
        }
    }
}

class Person {
    private String navn;
    private String aresse;
    private String telefonnummmer;
    public Person(String navn, String adresse, String telefon) {
        this.navn = navn;
        this.aresse = adresse;
        this.telefonnummmer = telefon;
    }

    public String toString() {
        return "Navn: " + navn + "\n" +
                "Adresse: " + aresse + "\n" +
                "Telefonnummer: " + telefonnummmer;
    }
}

class Student extends Person {
    private String studentnr;
    private String studienavn;
    public Student(String navn, String adresse, String telefonnummer, String studentnr, String studienavn) {
        super(navn, adresse, telefonnummer);
        this.studentnr = studentnr;
        this.studienavn = studienavn;
    }

    public String toString() {
        return super.toString() + "\n" +
                "Studentnr: " + studentnr + "\n" +
                "Studienavn: " + studienavn;
    }
}

class Ansatt extends Person {
    private String intituttnavn;
    private String lonn;
    public Ansatt(String navn, String adresse, String telefonnummer, String intituttnavn, String lonn) {
        super(navn, adresse, telefonnummer);
        this.intituttnavn = intituttnavn;
        this.lonn = lonn;
    }

    public String toString() {
        return super.toString() + "\n" +
                "Instituttnavn: " + intituttnavn + "\n" +
                "Lønn: " + lonn;
    }
}
