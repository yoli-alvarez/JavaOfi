module mx.edu.utez.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens mx.edu.utez.javafx to javafx.fxml;
    exports mx.edu.utez.javafx;
}