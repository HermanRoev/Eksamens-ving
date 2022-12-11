/*package EksamenVår2021;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Controller {

    List<Double> register = new ArrayList<>();

    @FXML
    private TextField txtTemperatur;

    @FXML
    private Label lblMin;

    @FXML
    private Label lblMaks;

    @FXML
    private Label lblGjennomsnitt;

    @FXML
    private Label lblFeil;

    @FXML
    void nullstill(ActionEvent event) {
        register.clear();
    }

    @FXML
    void registrer(ActionEvent event) {
        double temperatur = Double.parseDouble(txtTemperatur.getText());
        register.add(temperatur);
        register.sort(Comparator.naturalOrder());
        lblMin.setText(register.get(0));
        lblMaks.setText(register.get(register.size() - 1));
        lblGjennomsnitt.setText();
    }
}

 */