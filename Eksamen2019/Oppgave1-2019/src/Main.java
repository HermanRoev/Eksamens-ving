public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i += 3) {
            System.out.println(i);
        }
        int i = 2;
        int counter = 0;
        int sum = 0;
        while ( i <= 100) {
            counter++;
            sum += i;
            i += 2;
        }
        int gjennomsnitt = sum/counter;
        System.out.println(gjennomsnitt);
    }
}