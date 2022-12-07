public class Main {
    public static void main(String[] args) {
        int [] liste = {6,2,7,9,5,21,235,78,3,21,32,7,546,8,75,32,312,24,567,7};
        int antallSEN = Liste.biggerThanZero(liste);
        int antallFOR = Liste.forekommer(liste, 7);
        int størstTall = Liste.biggestNumber(liste);
        System.out.println(antallSEN);
        System.out.println(antallFOR);
        System.out.println(størstTall);
    }
}

class Liste {
    static int biggerThanZero(int [] array) {
        int counter = 0;
        for (int i : array) {
            if (i > 0) {
                counter++;
            }
        }
        return counter;
    }
    static int forekommer(int [] array, int tall) {
        int counter = 0;
        for (int i : array) {
            if (i == tall) {
                counter++;
            }
        }
        return counter;
    }
    static int biggestNumber(int [] array) {
        int biggest = 0;
        for (int i : array) {
            if (i > biggest) {
                biggest = i;
            }
        }
        return biggest;
    }
}