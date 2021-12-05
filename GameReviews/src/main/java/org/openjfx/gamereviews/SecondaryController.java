package org.openjfx.gamereviews;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.Slider;
import javafx.scene.control.CheckBox;


public class SecondaryController {

    @FXML
    private Button SecondaryView;
    @FXML
    private Button updateTextButton;
   
    @FXML
    private TextArea dataTextBox;
    @FXML
    private Slider nSlider;
    @FXML
    private CheckBox ABCCheckBox;
    @FXML
    private CheckBox abcCheckBox;
    @FXML
    private CheckBox numbersCheckBox;
  
    
    public static String OgString = null;
    double n = 100;
    

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    private void sText() throws IOException {

        n = Math.round(nSlider.getValue()); 
        
       OgString = RandomString.getAlphaNumericString(n, ABCCheckBox.isSelected(), abcCheckBox.isSelected(), numbersCheckBox.isSelected());
        System.out.println(Math.round(n)+ "   " + OgString);
        
        dataTextBox.setText(OgString);

    }
    
    
}