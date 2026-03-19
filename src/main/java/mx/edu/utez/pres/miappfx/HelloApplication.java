package mx.edu.utez.pres.miappfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
         */

        // Crear panel raíz
        StackPane root = new StackPane();

        // Crear la escena(ancho, alto)
        Scene scene = new Scene(root, 400, 300);
        // Configurar el stage
        stage.setTitle("Mi app JavaFX");
        stage.setScene(scene);
        stage.show(); // <- mostrar la ventana

        // Crear una etiqueta
        Label etiqueta = new Label("¡Hola JavaFX!");

        // Crear botón
        Button boton = new Button("Haz click aquí");

        // Definir acción del botón

    }

}
