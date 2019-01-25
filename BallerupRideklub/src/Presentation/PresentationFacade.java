/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Acquaintence.IBusiness;
import Acquaintence.IController;
import Acquaintence.IPresentation;
import javafx.stage.Stage;

/**
 *
 * @author Alexa
 */

public class PresentationFacade implements IPresentation, IController {
    
    protected static IBusiness IBus;
    private static PresentationFacade instance = null;
    private RunGUI runGUI;
    public static Stage stage;
    
    public static PresentationFacade getInstance() {
        if(instance == null) {
            instance = new PresentationFacade();
        }
        return instance;
    }
    
    @Override
    public void injectBusiness(IBusiness bus) {
        this.IBus = bus;
    }

    @Override
    public void injectStage(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void startApplication(String[] args) {
        if(runGUI == null) {
            runGUI = new RunGUI();
        }
        runGUI.startApplication(args);
    }
    
}
