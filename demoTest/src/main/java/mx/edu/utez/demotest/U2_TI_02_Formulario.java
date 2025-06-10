package mx.edu.utez.demotest;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.io.IOException;

public class U2_TI_02_Formulario extends Application {

    @Override

    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Label lblNombre = new Label("Nombre: ");
        TextField tfNombre = new TextField();
        Label lblEdad = new Label("Edad: ");
        TextField tfEdad = new TextField();
        //Label lblComentario = new Label("Comentario: ");
        //TextArea tfComentario = new TextArea();
        Label lblOpciones = new Label("Opciones: ");
        ObservableList<String> opciones = FXCollections.observableArrayList("Estudiante", "Profesor", "Admin");
        ComboBox<String> cmbOpciones = new ComboBox(opciones);
        Button btnCrear = new Button("Crear");
        Label lblResultado = new Label();

        GridPane form = new GridPane();
        //Cambiar a color verde
        form.setAlignment(Pos.CENTER);
        form.setHgap(10);
        form.setVgap(10);

        btnCrear.setOnAction(e -> {
            String nombre = tfNombre.getText();
            Integer edad = Integer.parseInt(tfEdad.getText());
            //String comentario = tfComentario.getText();
            String seleccion = cmbOpciones.getSelectionModel().getSelectedItem();
            if(nombre.isEmpty() || seleccion==null) {
                System.out.println("Todos los campos son obligatorios");
                lblResultado.setText("Todos los campos son obligatorios");
                form.setStyle("-fx-background-color: red;");
            } else {
                lblResultado.setText("Nombre: " + nombre + "\nOpciones " + seleccion);
                form.setStyle("-fx-background-color: #4b8b4b;");
            }
        });



        form.add(lblNombre, 0, 0);
        form.add(tfNombre, 1, 0);
        form.add(lblEdad, 0, 1);
        form.add(tfEdad, 1, 1);
        //form.add(lblComentario, 0, 2);
        //form.add(tfComentario, 1, 2);
        form.add(lblOpciones, 0, 3);
        form.add(cmbOpciones, 1, 3);
        form.add(btnCrear, 0, 4);
        form.add(lblResultado, 0, 5);


        //root set.Padding(new Insets(20));

        Scene scene = new Scene(form, 500, 700);

        stage.setTitle("Mi primer App en JavaFX");
        Image image = new Image(getClass().getResourceAsStream("/icons/departure.png"));
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}