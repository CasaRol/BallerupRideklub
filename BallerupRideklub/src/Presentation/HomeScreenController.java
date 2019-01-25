/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author CasaRol
 */
public class HomeScreenController implements Initializable {

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

    public void calculateHorse(ActionEvent event) {

    }

    @FXML
    public void calculatePerson(ActionEvent event) throws IOException {
//        FXMLLoader loader = new FXMLLoader();
//        loader.setLocation(HomeScreenController.class.getResource("JobInterface.fxml"));
//        person_btn = (ImageView) loader.load();
//        Scene scene = new Scene(person_btn);
//        setScene(scene);
    }

}
