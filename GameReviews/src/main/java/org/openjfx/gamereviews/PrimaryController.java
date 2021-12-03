package org.openjfx.gamereviews;

import java.io.IOException;

import javafx.fxml.FXML;

public class PrimaryController {

    public static String OgString = null;

    @FXML
    private void switchToSecondary() throws IOException {
        int n = 50;

        OgString = RandomString.getAlphaNumericString(n);
        System.out.println(OgString);
        App.setRoot("secondary");
        
    }
}
