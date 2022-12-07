import static javax.swing.JOptionPane.*;
public class Main {
    public static void main(String[] args) {
        String input = showInputDialog(null, "Skriv C for å konvertere til Celsius eller F for å konvertere til Farenheit.");
        double grader = Double.parseDouble(showInputDialog(null,"Legg inn grader: "));
        double konvertert = 0;
        switch (input.toUpperCase()) {
            case "C" -> {
                konvertert = (grader - 32) / 1.8;
                String ny = (String) String.format("%.2f", konvertert);
                showMessageDialog(null, grader + " grader Farenheit blir " + ny + " grader Celsius.");
            }
            case "F" -> {
                konvertert = grader * 1.8 + 32;
                showMessageDialog(null, grader + " grader Celsius blir " + konvertert + " grader Farenheit.");
            }
            default -> showMessageDialog(null, "Du la ikke inn F eller C");
        }
    }
}