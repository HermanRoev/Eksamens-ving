package EksamenVår2022;

public class Oppgave1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i<=1000; i+=10) {
            sum += i;
        }
        System.out.println(sum);
        int j = 0;
        int jsum = 0;
        while(j <= 1000) {
            jsum += j;
            j += 10;
        }
        System.out.println(jsum);

        for(int i = 10; i >= -10; i--) {
            if(i==-10) {
                System.out.print(i);
            }
            else {
                System.out.print(i+", ");
            }

        }
    }
}
