import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Trekning nyTrekning = new Trekning();
        int[] vinnere = nyTrekning.vinnere();
        System.out.println("Vinnerene er: ");
        for (int i : vinnere) {
            System.out.print(i + " ");
        }
    }
}

class Trekning {
    public int[] vinnere() {
        int[] vinnere = new int[7];
        for (int i = 0; i < 7; i++) {
            vinnere[i] = (int) (Math.random() * 34 + 1);
        }
        Arrays.sort(vinnere);
        return vinnere;
    }
}