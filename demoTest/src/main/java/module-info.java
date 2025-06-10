module mx.edu.utez.demotest {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens mx.edu.utez.demotest to javafx.fxml;
    exports mx.edu.utez.demotest;
}