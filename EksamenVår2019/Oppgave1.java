package EksamenVår2019;

public class Oppgave1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 100; i <= 200; i++) {
            sum += i;
        }
        System.out.println(sum);
        int j = 100;
        while (j <= 200) {
            System.out.println(j);
            j += 3;
        }
    }
}
