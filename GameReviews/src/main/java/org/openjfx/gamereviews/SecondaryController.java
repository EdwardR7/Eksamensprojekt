package org.openjfx.gamereviews;

import static org.openjfx.gamereviews.PrimaryController.OgString;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.*;

public class SecondaryController {

    @FXML
    private Button SecondaryView;
    @FXML
    private Button updateTextButton;
    @FXML
    private Text setText;

    @FXML
    private void switchToPrimary() throws IOException {

        App.setRoot("primary");
    }

    @FXML
    private void sText() throws IOException {
        System.out.println(OgString);
        setText.setText(OgString);

    }
}