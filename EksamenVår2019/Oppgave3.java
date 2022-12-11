package EksamenVår2019;

import java.util.ArrayList;
import java.util.Arrays;

public class Oppgave3 {
    public static void main(String[] args) {
        ArrayList<Double> liste = new ArrayList<>(Arrays.asList(0.4 , -2.9, -2.8, -3.8, 1.6, -2.4, -0.9, -2.2, 0.5, -4.0));
        System.out.println(Temperatur.gjennomsnitt(liste));
        System.out.println(Temperatur.minimum(liste));
    }
}

class Temperatur {
    public static double gjennomsnitt(ArrayList<Double> liste) {
        double sum = 0;
        for (Double i : liste) {
            sum += i;
        }
        return sum/liste.size();
    }

    public static double minimum(ArrayList<Double> liste) {
        double minste = liste.get(0);
        for (Double i : liste) {
            if (i < minste) {
                minste = i;
            }
        }
        return minste;
    }
}
