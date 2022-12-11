package EksamenVår2020;

public class Oppgave1 {
    public static void main(String[] args) {
        int [] liste = {1,3,6,2,7,10,23,6,3,6};
        for (int i: liste) {
            System.out.print(i + " ");
        }
        for (int i = liste.length-1; i >= 0; i--) {
            System.out.print(liste[i] + " ");
        }
        int i = 0;
        int sum = 0;
        while (i < liste.length) {
            sum += liste[i];
            i++;
        }
        double gjennomsnitt = sum/liste.length;
        System.out.print(gjennomsnitt);
    }
}
