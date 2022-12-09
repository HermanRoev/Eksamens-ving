import java.util.ArrayList;

public class TempController {
    public ArrayList<Double> temperaturer = new ArrayList<>() ;
    @FXML
    private Label lblResultat;
    @FXML
    private TextField txtTemperatur;
    @FXML
    void nullstill(ActionEvent event) {
        temperaturer.clear();
        lblResultat.setText("");
        txtTemperatur.setText("");
    }
    @FXML
    void registrer(ActionEvent event) {
        try {
            double input = Double.parseDouble(txtTemperatur.getText());
            temperaturer.add(input);
            double sum = 0;
            int counter = 0;
            for (Double i : temperaturer) {
                sum += i;
                counter++;
            }
            double gjennomsnitt = sum/counter;
            lblResultat.setText(String.valueOf(gjennomsnitt));
            txtTemperatur.setText("");
        }
        catch (Exception e) {
            lblResultat.setText("Du la ikke inn gyldig input");
            txtTemperatur.setText("");
        }
    }
}