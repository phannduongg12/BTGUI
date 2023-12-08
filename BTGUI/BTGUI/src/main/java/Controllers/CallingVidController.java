package Controllers;

import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class CallingVidController implements Initializable {
    public ImageView endcall;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        endcall.setOnMouseClicked(event -> toCon1());
    }

    private void toCon1() {
        Main.primaryStage.setScene(MessController.con1Scene);
    }
}
