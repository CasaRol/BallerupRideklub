/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Acquaintence.IBusiness;
import Acquaintence.IData;

/**
 *
 * @author Alexa
 */
public class DataFacade implements IData {
    
    private static DataFacade instance = null;
    private IBusiness Ibus;

    @Override
    public void injectBusiness(IBusiness bus) {
        this.Ibus = bus;
    }
    
    public static DataFacade getInstance() {
        if(instance == null) {
            instance = new DataFacade();
        }
        return instance;
    }
    
}
