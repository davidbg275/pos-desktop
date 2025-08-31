package com.miempresa.pos;
import javafx.application.Application;

public class MainApp extends Application {
    @Override
    public void start(javafx.stage.Stage stage) throws java.io.IOException {

        // Aquí diremos qué debe mostrarse en la ventana
        javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(
                getClass().getResource("/ui/main.fxml")
        );
        javafx.scene.Scene scene = new javafx.scene.Scene(loader.load(),900, 600);
        stage.setTitle("-----POS Desktop------");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args){
        launch();
    }

}
