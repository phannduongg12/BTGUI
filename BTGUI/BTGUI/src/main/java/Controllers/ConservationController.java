package Controllers;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ConservationController implements Initializable {
    public ImageView calling;
    public ImageView video;
    public static Scene callingScene = null;
    public ImageView menu;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        calling.setOnMouseClicked(event -> openCallingWindow());
        video.setOnMouseClicked(event -> openVidCallingWindow());
        menu.setOnMouseClicked(event -> openMenuWindow());
    }

    private void openMenuWindow() {
        Main.primaryStage.setScene(Main.messScene);
    }

    private void openVidCallingWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/CallingVid.fxml"));

        try {
            callingScene = new Scene(loader.load());

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        Main.primaryStage.setScene(callingScene);
    }

    private void openCallingWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Calling.fxml"));

        try {
            callingScene = new Scene(loader.load());

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        Main.primaryStage.setScene(callingScene);
    }
}
