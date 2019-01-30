/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Acquaintence.IController;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 */
public class RunGUI extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HomeScreen.fxml"));
        Parent root = loader.load();
        Scene newScene = new Scene(root);
        IController controller = loader.getController();
        controller.injectStage(stage);
        stage.setTitle("Ballerup Rideklub - Internal grading");

        stage.setScene(newScene);
        stage.show();
    }

    public void startApplication(String[] args) {
        launch(args);
    }

}
