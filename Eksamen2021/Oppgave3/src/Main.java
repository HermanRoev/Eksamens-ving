import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Metoder run = new Metoder();
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(1);
        liste.add(5);
        liste.add(7);
        liste.add(4);
        liste.add(9);
        liste.add(2);
        liste.add(4);
        liste.add(7);
        liste.add(5);
        System.out.println("Største tallet i listen er " + run.minste(liste));
        System.out.println("Minste tallet i listen er " + run.storst(liste));
    }
}

class Metoder {
    public int storst(ArrayList<Integer> liste) {
        Collections.sort(liste);
        return liste.get(0);
    }

    public int minste(ArrayList<Integer> liste) {
        Collections.sort(liste, Collections.reverseOrder());
        return liste.get(0);
    }
}