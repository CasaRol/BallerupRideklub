/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Acquaintence.IController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
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
    @FXML
    private RadioButton rbtn_concentYes;
    @FXML
    private RadioButton rbtn_concentNo;
    @FXML
    private Button btn_back;
    @FXML
    private TextField txt_firstName;
    @FXML
    private TextField txt_lastName;
    @FXML
    private TextField txt_weight;
    @FXML
    private TextField txt_height;
    @FXML
    private TextField txt_BMI;
    @FXML
    private RadioButton rbtn_beginner;
    @FXML
    private ToggleGroup level;
    @FXML
    private RadioButton rbtn_trained;
    @FXML
    private RadioButton rbtn_expert;
    @FXML
    private RadioButton rbtn_balanceYes;
    @FXML
    private ToggleGroup balance;
    @FXML
    private RadioButton rbtn_balanceNo;
    @FXML
    private Button btn_calculate;
    @FXML
    private Button btn_cancel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        label_Information.setText("\uD83D");
    } 
    
    @Override
    public void injectStage(Stage stage) {
        PresentationFacade.stage = stage;
    }

    @FXML
    private void OpenInformation(MouseEvent event) {
        
    }

    @FXML
    private void backToMainMenu(ActionEvent event) throws IOException {
        PresentationFacade.getInstance().changeScene("HomeScreen.fxml");
    }

    @FXML
    private void calcScore(ActionEvent event) {
    }

    @FXML
    private void clearInfo(ActionEvent event) {
        txt_firstName.clear();
        txt_lastName.clear();
        txt_weight.clear();
        txt_height.clear();
        rbtn_beginner.setSelected(false);
        rbtn_trained.setSelected(false);
        rbtn_expert.setSelected(false);
        txt_BMI.clear();
        rbtn_balanceYes.setSelected(false);
        rbtn_balanceNo.setSelected(false);
        rbtn_concentYes.setSelected(false);
        rbtn_concentNo.setSelected(false);
    }

    
    
}
