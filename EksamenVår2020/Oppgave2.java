package EksamenVår2020;

public class Oppgave2 {
    public static void main(String[] args) {
        System.out.println(KonverterTemperatur.tilCelsius(70.5)); //Printer ut grader inn til fahrenheit
        System.out.println(KonverterTemperatur.tilFahrenheit(22.5)); //Printer ut grader inn til celsius
    }
}

class KonverterTemperatur {
    static double tilCelsius(double inn) {
        return (inn - 32) / 1.8;
    }
    static double tilFahrenheit(double inn) {
        return inn * 1.8 + 32;
    }
}