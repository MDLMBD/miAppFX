package mx.edu.utez.pres.miappfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick(){
        welcomeText.setText("Welcome to FX app!");
    }


}
