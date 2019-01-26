/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Acquaintence.IController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author CasaRol
 */
public class CalcPersonController implements IController, Initializable {

    @FXML
    private ToggleGroup Consent;
    @FXML
    private Label label_Information;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        label_Information.setText("\\uD83D");
    }    

    @FXML
    private void OpenInformation(MouseEvent event) {
    }

    @Override
    public void injectStage(Stage stage) {
        PresentationFacade.stage = stage;
    }
    
}
