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
    private void Algoritme1() throws IOException{
        
        char charArray[] = dataTextBox.getText().toCharArray();
        int size = charArray.length;
        
        for(int i = 0; i < size; i++){       
            for(int j = i+1; j < size; j++){
                if(charArray[i]>charArray[j]){
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                            
                   
                }
            }
            
            
        }
        
        dataTextBox.setText(new String(charArray));
       }
        @FXML
    public void Algoritme2() throws IOException{
    {
        
        
        char charArray[] = dataTextBox.getText().toCharArray();
        int n = charArray.length;
 
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(charArray, n, i);
 
        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = charArray[0];
            charArray[0] = charArray[i];
            charArray[i] = (char) temp;
 
            // call max heapify on the reduced heap
            heapify(charArray, i, 0);
        }
              dataTextBox.setText(new String(charArray));
    }
    
    }
    

    public void heapify(char[] arr, int n, int i) throws IOException{
        
        
    
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2
 
        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;
 
        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;
 
        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = (char) swap;
 
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
}
    
            /*@FXML
        private void Algoritme2(char Args[]) throws IOException{

            char charArray[] = dataTextBox.getText().toCharArray();
      HeapSort hs = new HeapSort();
      hs.sort(charArray);
  
      System.out.println("Sorted array is");
    }*/
    