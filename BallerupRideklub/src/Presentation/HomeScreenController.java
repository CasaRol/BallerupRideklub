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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author CasaRol
 */
public class HomeScreenController implements IController, Initializable {
    
//    private PresentationFacade presentation = PresentationFacade.getInstance();

    @FXML
    private ImageView horse_btn;
    @FXML
    private ImageView person_btn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @Override
    public void injectStage(Stage stage) {
        PresentationFacade.stage = stage;
    }
    
    public void calculateHorse(ActionEvent event) {

    }

    @FXML
    public void calculatePerson(MouseEvent event) throws IOException {
        PresentationFacade.getInstance().changeScene("CalcPerson.fxml");
    }

    @FXML
    private void calculateHorse(MouseEvent event) {
    }

    

}
