package EksamenVår2021;

public class Oppgave3 {
    public static void main(String[] args) {
        Student herman = new Student("Herman Røv", "S348906");
        Student ludvig = new Student("Ludvig", "S378904");
        Student[] studenter = new Student[100];
        studenter[0] = herman;
        studenter[1] = ludvig;
        Fag programmering = new Fag("Programmering", "2022", studenter);
        System.out.println(programmering);
        for (Student i : programmering.getStudenter()) {
            if (i != null)
                System.out.println(i);
        }
    }
}

class Fag {
    private String navn;
    private String år;
    private Student[] studenter = new Student[100];
    public Fag(String navn, String år, Student[] studenter) {
        this.navn = navn;
        this.år = år;
        this.studenter = studenter;
    }

    public Student[] getStudenter() {
        return studenter;
    }

    public void setStudenter(Student[] studenter) {
        this.studenter = studenter;
    }

    public String getÅr() {
        return år;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setÅr(String år) {
        this.år = år;
    }

    public String toString() {
        return "Fag: " + navn + ",  år : " + år;
    }
}

class Student {
    private String navn;
    private String studNr;
    public Student(String navn, String studNr) {
        this.navn = navn;
        this.studNr = studNr;
    }

    public String getStudNr() {
        return studNr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setStudNr(String studNr) {
        this.studNr = studNr;
    }

    public String toString() {
        return "Student : Navn=" + navn + ", StudNr=" + studNr;
    }
}
