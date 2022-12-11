/*import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

class Lodd{
    public String	navn;
    public String	telefonnr;
}

class Lotteri{
    public static final int MAKS_ANTALL =	1000;
    public int antallSolgte =	0;
    public Lodd[] loddbok =	new Lodd[MAKS_ANTALL];

    public boolean kjøpLodd(Lodd nyttLodd){
        if (antallSolgte > MAKS_ANTALL) {
            loddbok[antallSolgte] = nyttLodd;
            antallSolgte++;
            return true;
        }
        else {
            return false;
        }
    }
    public String trekkVinner(){
        int solgte = (int) (Math.random() * antallSolgte);
        return "Vinnerens Navn: " + loddbok[solgte].navn + "\n" +
                "Vinnerens Telefonnummer: " + loddbok[solgte].telefonnr;
    }
}

public class FXMLDocumentController {

    private Lotteri	lotteri = new Lotteri();

    @FXML
    private Label lblResultater;

    @FXML
    private TextField txtNavn, txtTelefonnr;

    @FXML
    public void regLoddsalg(ActionEvent	event) {
        Lodd etlodd = new Lodd();
        etlodd.navn = txtNavn.getText();
        etlodd.telefonnr = txtTelefonnr.getText();
        if (!lotteri.kjøpLodd(etlodd)) {
            lblResultater.setText("Ikke mulig å kjøpe flere lodd");
        }
    }

    @FXML
    public void foretaTrekning(ActionEvent	event)	{
        String vinner = lotteri.trekkVinner();
        lblResultater.setText(vinner);
    }

    @FXML
    public void nyttLotteri(ActionEvent	event)	{
        lotteri = new Lotteri();
    }
}

 */