package mx.edu.utez.holamundojavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Label myLabel = new Label("Bienvenidos!!");
        StackPane root = new StackPane(myLabel);
        Scene scene = new Scene(root, 200, 200);

        stage.setTitle("Prueba");
        //Con control + espacio para seleciionar la carpeta en donde está la imagen
        Image image = new Image(getClass().getResourceAsStream("/Icons/schedule_10693675.png"));
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }
}