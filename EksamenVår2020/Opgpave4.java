/*import java.util.ArrayList;

public class Controller {
    ArrayList<Observarsjoner> register = new ArrayList<>();
    @FXML
    private Label lblSnittRegn;
    @FXML
    private Label lblSnittTemp;
    @FXML
    private TextField txtDato;
    @FXML
    private TextField txtTemp;
    @FXML
    private TextField txtRegn;
    @FXML
    void btnRegistrerVær(ActionEvent event) {
        Observarsjoner observasjon = new Observarsjoner(txtDato.getText(), Double.parseDouble(txtTemp.getText()), Double.parseDouble(txtRegn.getText()));
        register.add(observasjon);
        txtRegn.setText("");
        txtTemp.setText("");
        txtDaro.setText("");
    }
    @FXML
    void btnSnittRegn(ActionEvent event) {
        double sumRegn = 0;
        for (Observarsjoner i : register) {
            double regn = i.getNedbør();
            sumRegn += regn;
        }
        double snitt = sumRegn/register.size();
        lblSnittRegn.setText(snitt);
    }
    @FXML
    void btnSnittTemperatur(ActionEvent event) {
        double sumTemp = 0;
        for (Observarsjoner i : register) {
            double temp = i.getTempratur();
            sumTemp += temp;
        }
        double snitt = sumTemp/register.size();
    }
    @FXML
    void btnSlettRegister(ActionEvent event) {
        register.clear();
    }
}

public class Observarsjoner {
    private String dato;
    private double tempratur;
    private double nedbør;

    public Observarsjoner(String dato, double tempratur, double nedbør) {
        this.dato = dato;
        this.tempratur = tempratur;
        this.nedbør = nedbør;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public double getTempratur() {
        return tempratur;
    }

    public void setTempratur(double tempratur) {
        this.tempratur = tempratur;
    }

    public double getNedbør() {
        return nedbør;
    }

    public void setNedbør(double nedbør) {
        this.nedbør = nedbør;
    }
}

 */