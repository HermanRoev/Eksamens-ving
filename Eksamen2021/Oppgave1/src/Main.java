public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 5; i <= 100; i+=5) {
            System.out.println(i);
            sum += i;
            count++;
        }
        System.out.println(sum/count);

        int j = 5;
        int jsum = 0;
        int jcounter = 0;
        while (j <= 100) {
            System.out.println(j);
            jsum += j;
            jcounter++;
            j += 5;
        }
        System.out.println(jsum/jcounter);
    }
}