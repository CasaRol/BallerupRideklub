/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Acquaintence.IBusiness;
import Acquaintence.IData;
import Acquaintence.IPresentation;

/**
 *
 * @author Alexa
 */
public class BusinessFacade implements IBusiness {
    
    private IData Idata;
    private IPresentation Ipres;
    private static BusinessFacade instance = null;
    
    public static BusinessFacade getInstance() {
        if(instance == null) {
            instance = new BusinessFacade();
        }        
        return instance;
    }

    @Override
    public void injectData(IData data) {
        this.Idata = data;
    }

    @Override
    public void injectPresentation(IPresentation pres) {
        this.Ipres = pres;
    }
    
}
