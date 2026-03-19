module mx.edu.utez.pres.miappfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens mx.edu.utez.pres.miappfx to javafx.fxml;
    exports mx.edu.utez.pres.miappfx;
}