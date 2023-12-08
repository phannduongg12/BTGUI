package Controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    public static Stage primaryStage;
    public static Scene messScene = null;
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Mess.fxml"));

        try {
            messScene = new Scene(loader.load());

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        primaryStage = new Stage();
        primaryStage.setScene(messScene);


        primaryStage.setTitle("Mess");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
