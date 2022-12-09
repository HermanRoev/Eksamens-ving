import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /* Det skal lages en enkel løsning med inputbokser og meldingboks for å konvertere fra celcius grader (C)
        til fahrenheit (F) og motsatt.

        Løsningen skal gjøre følgende :
        Lese inn en streng fra en inputdialogboks hvor det skal oppgis hva det skal konverteres FRA (C eller F
        skal skrives inn)
        Lese så inn gradene fra en ny inputdialogboks
        Konvertere gradene til en double
        Avhengig av hva som er skrevet inn i den første inputboksen regne ut resultatet via følgende formler:
        Fra Celcius til Fahrenheit: F = C * 1.8 + 32
        fra Fahrenheit til Celcius: C = (F - 32) / 1.8
        Skngsbriv tilslutt ut resultatet med passende ledetekst med to desimaler i en meldioks.

        Dersom det ikke er skrevet inn hverken C eller F i den første inputboksen skal det ikke regnes ut noe, men
        skrives ut i meldingsboksen at det må skrives inn enten C eller F. */
        boolean check = true;
        double convertedTemp = 0;
        CelsiusOrFarenheit converter = new CelsiusOrFarenheit();
        while (check) {
            converter.getValues();
            switch (converter.switchValue) {
                case "C":
                    convertedTemp = converter.toCelsius(converter.temperatur);
                    JOptionPane.showMessageDialog(null, converter.temperatur+" grader Farenheit, blir "+convertedTemp+" grader Celsius.");
                    check = false;
                    break;
                case "F":
                    convertedTemp = converter.toFarenheit(converter.temperatur);
                    JOptionPane.showMessageDialog(null, converter.temperatur+" grader Celsius, blir "+convertedTemp+" grader Farenheit.");
                    check = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Det må skrives inn enten F eller C.");
            }
        }
    }
}
class CelsiusOrFarenheit {
    String switchValue;
    int temperatur = 0;
    public void getValues() {
        switchValue = JOptionPane.showInputDialog(null, "Enter F to convert to Farenheit or C to convert to Celsius.");
        temperatur = Integer.parseInt(JOptionPane.showInputDialog(null, "Skriv inn temperatur: "));
    }
    public double toCelsius(int innverdi) {
        return ((innverdi-32)/1.8);
    }
    public double toFarenheit(int innverdi) {
        return (innverdi*1.8) + 32;
    }
}