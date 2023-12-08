package Controllers;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class MessController implements Initializable {
    public VBox conversation1;
    public static Scene con1Scene = null;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        conversation1.setOnMouseClicked(event -> onConversation1());
    }

    private void onConversation1() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Conservation.fxml"));

        try {
            con1Scene = new Scene(loader.load());

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        Main.primaryStage.setScene(con1Scene);
    }
}
