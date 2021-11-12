package org.openjfx.gamereviews;

import java.io.IOException;

import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
       int n = 100;

    System.out.println( RandomString.getAlphaNumericString(n));
      

        App.setRoot("secondary");
    }
}




