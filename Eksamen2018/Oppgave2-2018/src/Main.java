public class Main {
    public static void main(String[] args) {
        int [] list = {-3, 41, 5, -3, 2, 49};
        int teller = 0;
        for (int i : list) {
            if (i > 10) {
                teller++;
            }
        }
        System.out.println(teller);
        for (int i = 0; i < list.length; i += 2) {
            System.out.println(list[i]);
        }
        int sum = 0;
        int count = 0;
        for (int i : list) {
            if (i > 0) {
                sum += i;
                count++;
            }
        }
        System.out.println(sum);
        System.out.println(sum/count);
    }
}