import org.w3c.dom.ls.LSOutput;

public class Controller {
    int number1 = 0;
    int number2 = 0;
    int antallRett = 0;
    int antallFeil = 0;
    String[] riktig = {"Så bra", "Helt riktig", "Du er best", "FANTASTISK", "Se på han da"};
    String[] feil = {"Elendig", "Du suger", "Drep deg selv", "Hva holder du på med???", "En snegle er bedre enn deg"};
    @FXML
    private Label lblAntallRett;
    @FXML
    private Label lblAntallFeil;
    @FXML
    private Label lblProsentRett;
    @FXML
    private Label lblRettProsent;
    @FXML
    private Label lblFeilProsent;
    @FXML
    private Label lblOppgave;
    @FXML
    private Label lblResultat;
    @FXML
    private TextField txtSvar;
    @FXML
    void nullstill(ActionEvent event) {
        lblAntallRett.setText("");
        lblAntallFeil.setText("");
        lblFeilProsent.setText("");
        lblRettProsent.setText("");
        lblOppgave.setText("");
        lblResultat.setText("");
        antallRett = 0;
        antallFeil = 0;
    }
    @FXML
    void nyOppgave(ActionEvent event) {
        number1 = (int)(Math.random()*10);
        number2= (int)(Math.random()*10);
        lblOppgave.setText(number1 + " * " + number2 + " = ");
    }

    @FXML
    void svar(ActionEvent event) {
        txtSvar.setText("");
        try {
            int svar = Integer.parseInt(txtSvar.getText());
            int randomSvar = (int)(Math.random()*5);
            if (svar == number1*number2) {
                lblResultat.setText(riktig[randomSvar-1]);
                antallRett++;
                lblAntallRett.setText(antallRett);

            }
            else {
                lblResultat.setText(feil[randomSvar-1]);
                antallFeil++;
                lblAntallFeil.setText(antallFeil);
            }
            double prosentRett = (double) antallRett/(antallRett+antallFeil);
            int rett = (int) (prosentRett*100);
            int feil = 100-rett;
            lblRettProsent.setText(String.valueOf(rett)+"%");
            lblFeilProsent.setText(String.valueOf(feil)+"%");
        }
        catch(Exception e) {
            lblResultat.setText("Du la ikke inn et gyldig svar. Prøv igjen.");
        }
    }
}