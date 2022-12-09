public class Main {
    public static void main(String[] args) {
        int[] tall = {1,4,7,8,5,1,2,4,5,7,8,7,5,3,2,6,3,};
        int sjekkfor = 10;
        boolean sjekk = Metoder.funnetTall(tall, sjekkfor);
        if (sjekk) {
            System.out.println("Tallet finnes i arrayet");
        }
        else {
            System.out.println("Talles finnes ikke i arrayet");
        }
    }
}

class Metoder {
    static boolean funnetTall(int[] array, int heltall) {
        for (int i : array) {
            if (i == heltall) {
                return true;
            }
        }
        return false;
    }
}