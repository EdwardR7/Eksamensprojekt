package org.openjfx.gamereviews;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.Slider;
import javafx.scene.control.CheckBox;
import java.util.Arrays;


public class SecondaryController {

    @FXML
    private TextArea dataTextBox;
    @FXML
    private TextArea InsertTextBox;
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
    @FXML
    private void insertText(){
        
        dataTextBox.setText(InsertTextBox.getText());
        
    }
    
    @FXML
    private void Algoritme1() throws IOException{
        
        char charArray[] = dataTextBox.getText().toCharArray();
        
         int size = charArray.length;
        for(int i = 0; i < size; i++){
            for(int j = i+1; j < size; j++){
                if(charArray[i]>charArray[j]){
                    int temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = (char) temp;
                }
            }
        }
        dataTextBox.setText(new String(charArray));
    }
    
}