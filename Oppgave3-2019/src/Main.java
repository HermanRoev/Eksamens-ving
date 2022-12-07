import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Lydbok harrypotter = new Lydbok("Harry Potter", "J.K.Rowling", 500, 90);
        Papirbok narnia = new Papirbok("Narnia", "IDK", 300, 1236789487);
        ArrayList<Bok> liste = new ArrayList<>();
        liste.add(harrypotter);
        liste.add(narnia);
        for (Bok i : liste) {
            String print = i.toString();
            System.out.println(print);
        }
    }
}

class Bok {
    private String tittel, forfatter;
    private double pris;

    public Bok(String tittel, String forfatter, double pris) {
        this.tittel = tittel;
        this.forfatter = forfatter;
        this.pris = pris;
    }

    public String toString() {
        return "Tittel: " + tittel + "\n" +
                "Forfatter: " + forfatter + "\n" +
                "Pris: " + pris;
    }
}

class Papirbok extends Bok {
    private int ISBN;
    public Papirbok(String tittel, String forfatter, double pris, int ISBN) {
        super(tittel, forfatter, pris);
        this.ISBN = ISBN;
    }
    public String toString() {
        return super.toString() + "\n" + "ISBN: " + ISBN;
    }
}

class Lydbok extends Bok {
    private int lengdeminutter;

    public Lydbok(String tittel, String forfatter, double pris, int lengdeminutter) {
        super(tittel, forfatter, pris);
        this.lengdeminutter = lengdeminutter;
    }

    public String toString() {
        return super.toString() + "\n" + "Lengdeminutter: " + lengdeminutter;
    }
}