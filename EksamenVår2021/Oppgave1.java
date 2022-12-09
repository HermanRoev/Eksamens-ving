package EksamenVår2021;

public class Oppgave1 {
    public static void main(String[] args) {
        int[] liste = {20, 34, -4, 4, 5, 11, -23};
        for (int i : liste) {
            System.out.print(i + " ");
        }
        System.out.println("");
        for (int i = liste.length-1; i >= 0; i--) {
            System.out.print(liste[i] + " ");
        }
        System.out.println("");
        int sum = 0;
        for (int i : liste) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println(sum/liste.length);
        for (int i = 1; i < 20; i++) {
            System.out.print(i + " ");
        }
    }
}
