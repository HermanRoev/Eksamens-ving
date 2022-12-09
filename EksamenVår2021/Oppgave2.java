package EksamenVår2021;
import static javax.swing.JOptionPane.*;
public class Oppgave2 {
    public static void main(String[] args) {
        double vekt = Double.parseDouble(showInputDialog(null,"Legg inn vekt: "));
        double høyde = Double.parseDouble(showInputDialog(null, "Legg inn høyde: "));
        int bmi = (int) (Math.round(1.3 * vekt)/Math.pow(høyde/100, 2.5));
        System.out.println("Din bmi er: " + bmi);
    }
}
