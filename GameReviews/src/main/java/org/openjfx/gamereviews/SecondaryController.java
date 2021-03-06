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
    private TextArea insertTextBox;
    @FXML
    private Slider nSlider;
    @FXML
    private CheckBox ABCCheckBox;
    @FXML
    private CheckBox abcCheckBox;
    @FXML
    private CheckBox numbersCheckBox;
    @FXML
    private CheckBox specialCheckBox;

    public static String OgString = null;
    double n = 100;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    private void sText() throws IOException {

        n = Math.round(nSlider.getValue());

        OgString = RandomString.getAlphaNumericString(n, ABCCheckBox.isSelected(), abcCheckBox.isSelected(), numbersCheckBox.isSelected(), specialCheckBox.isSelected());
        System.out.println(Math.round(n) + "   " + OgString);

        dataTextBox.setText(OgString);

    }

    @FXML
    private void InsertText() {

        dataTextBox.setText(insertTextBox.getText());

    }

    @FXML
    private void Algoritme1() throws IOException { // BUBBLE

        char charArray[] = dataTextBox.getText().toCharArray();
        int size = charArray.length;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (charArray[i] > charArray[j]) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;

                }
            }

        }
        dataTextBox.clear();
        dataTextBox.setText(new String(charArray));
    }

    @FXML
    public void Algoritme2() throws IOException { //HEAP 1
        {

            char charArray[] = dataTextBox.getText().toCharArray();
            int n = charArray.length;

            // Build heap (rearrange array)
            for (int i = n / 2 - 1; i >= 0; i--) {
                heapify(charArray, n, i);
            }

            // One by one extract an element from heap
            for (int i = n - 1; i > 0; i--) {
                // Move current root to end
                int temp = charArray[0];
                charArray[0] = charArray[i];
                charArray[i] = (char) temp;

                heapify(charArray, i, 0);
            }
            dataTextBox.clear();
            dataTextBox.setText(new String(charArray));
        }

    }

    public void heapify(char[] arr, int n, int i) throws IOException { //HEAP 2

        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = (char) swap;

            heapify(arr, n, largest);
        }
    }

    @FXML
    private void Algoritme3() throws IOException { //bubble med navne

        String names[] = dataTextBox.getText().split(",");

        int size = names.length;

        String temp;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {

                if (names[i].compareTo(names[j]) > 0) {
                    // swapping
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }

        }
        dataTextBox.clear();
        for (int i = 0; i < size; i++) {
            dataTextBox.insertText(dataTextBox.getSelection().getEnd(), names[i] + ", ");
        }
    }
}
