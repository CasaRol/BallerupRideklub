/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balleruprideklub;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Alexa
 */
public class BallerupRideklub extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Person person = new Person();
        person.calcScore(66, 168, "Øvet", true);
        
        Parent root = FXMLLoader.load(getClass().getResource("CalcPerson.fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("Ballerup Rideklub - Karakterberegning");
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
