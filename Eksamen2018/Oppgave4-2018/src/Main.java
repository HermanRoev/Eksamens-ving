import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dato dato1 = new Dato(13, 8, 1999);
        Dato dato2 = new Dato(24, 7, 2023);
        Dato dato3 = new Dato(8, 1, 2002);
        Dato dato4 = new Dato(15, 12, 2023);

        ArrayList<Ansatt> Stab = new ArrayList<>();
        Ansatt ansatt1 = new Ansatt("Ludvig", dato1, dato2);
        Ansatt ansatt2 = new Ansatt("James", dato3, dato4);
        Stab.add(ansatt1);
        Stab.add(ansatt2);

        for (Ansatt i: Stab) {
            System.out.println(i);
        }
    }
}

class Ansatt{
    private String navn;
    private Dato født;
    private Dato tiltrådt;
    public Ansatt(String navn, Dato født, Dato tiltrådt) {
        this.navn = navn;
        this.født = født;
        this.tiltrådt = tiltrådt;
    }

    public String toString() {
        return "Navn: " + navn + "\n" +
                "Født: " + født + "\n" +
                "Tiltrådt: " + tiltrådt;
    }
}

class Dato {
    private int dag, måned, år;

    public Dato(int dag, int måned, int år) {
        this.dag = dag;
        this.måned = måned;
        this.år = år;
    }

    private static String månedsnavn(int mnd) {
        String[] navn = {"januar", "februar", "mars", "april", "mai", "juni", "juli", "august", "september", "oktober", "november", "desember"};
        if (mnd > 0 && mnd < 13) {
            return navn[mnd - 1];
        } else {
            return "ukjent	måned";
        }
    }
    public String toString() {
        return dag + " " + månedsnavn(måned)+ " " + år;
    }
}

