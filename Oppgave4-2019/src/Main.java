import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
public class Controller {
    int[] priser = {36, 59, 82, 105, 128};
    @FXML
    private Label lblResultat, lblFeilSoner, lblFeilAntall;
    @FXML
    private TextField txtAntall, txtSoner;
    @FXML
    private CheckBox chkRabatt;
    @FXML
    private void btnBeregn(ActionEvent event) {
        boolean sjekk = chkRabatt.isSelected();
        lblFeilAntall.setText("");
        lblFeilSoner.setText("");
        int soner;
        int antall;
        try {
            soner = Integer.parseInt(txtSoner.getText());
        }
        catch (Exception e) {
            soner = 0;
        }
        try {
            antall = Integer.parseInt(txtAntall.getText());
        }
        catch (Exception e) {
            antall = 0;
        }
        if (soner < 1 || soner > 5) {
            lblFeilSoner.setText("Feil antall soner!");
        }
        if (antall < 1) {
            lblFeilAntall.setText("Feil antall!");
        }
        if (sjekk) {
            int pris = (priser[soner-1]*antall)/2;
            lblResultat.setText(pris + " kr");
        }
        else {
            int pris = (priser[soner-1]*antall);
            lblResultat.setText(pris + " kr");
        }
    }
}