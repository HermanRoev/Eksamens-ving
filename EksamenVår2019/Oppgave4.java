/*package EksamenVår2019;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

class Helse{
    public static String beregnHelse(String navn, double vekt, double høyde, int fødselsår){
        double bmi = vekt/høyde*høyde;
        String bmidef = null;
        if (bmi < 18) {
            bmidef = "undervektig";
        }
        if (bmi >= 18 && bmi < 25) {
            bmidef = "normalvektig";
        }
        if (bmi >= 25 && bmi < 30) {
            bmidef = "overvektig";
        }
        if (bmi >= 30) {
            bmidef = "fet";
        }
        int minFrekvens = (int) Math.round((220-fødselsår)*0.5);
        int maxFrekvens = (int) Math.round((220-fødselsår)*0.85);

        return navn + " født " + fødselsår + " er " + bmidef + "\n" +
                "Hjertefrekvens bør ligge mellom " + minFrekvens + " og " + maxFrekvens;
    }
}

public class FXMLDocumentController {

    @FXML
    private TextField txtNavn;

    @FXML
    private TextField txtFødt;

    @FXML
    private TextField txtHøyde;

    @FXML
    private TextField txtVekt;

    @FXML
    private Label lblResultat;

    @FXML
    void beregn(ActionEvent event) {
        try {
            String navn = txtNavn.getText();
            int født = Integer.parseInt(txtFødt.getText());
            double vekt = Double.parseDouble(txtVekt.getText());
            double høyde = Double.parseDouble(txtHøyde.getText());
            String result = Helse.beregnHelse(navn, vekt, høyde, født);
            lblResultat.setText(result);
        }
        catch (Exception e) {
            lblResultat.setText("Du la inn noe feil der :)");
        }
    }
}

 */