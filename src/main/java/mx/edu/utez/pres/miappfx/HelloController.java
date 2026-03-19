package mx.edu.utez.pres.miappfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick(){
        welcomeText.setText("Tengo hambre");
    }

    @FXML
    protected void onHello2ButtonClick(){
        welcomeText.setText("Tengo hambre we");
    }

}
