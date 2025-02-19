package com.example;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField radiusField;
    
    @FXML
    private TextField heightField;
    
    @FXML
    private Label resultLabel;
    
    @FXML
    private Label successMessage;

    @FXML
    public void calculateSurfaceArea() {
        try {
            double radius = Double.parseDouble(radiusField.getText());
            double height = Double.parseDouble(heightField.getText());
            double surfaceArea = 2 * Math.PI * radius * (radius + height);
            resultLabel.setText("Felszín: " + surfaceArea + " cm2");
            successMessage.setVisible(true);
        } catch (NumberFormatException e) {
            resultLabel.setText("Nem jó probáld meg számokkal.");
            successMessage.setVisible(false);
        }
    }
}
