/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Starter;

import Acquaintence.IBusiness;
import Acquaintence.IData;
import Acquaintence.IPresentation;
import Business.BusinessFacade;
import Data.DataFacade;
import Presentation.PresentationFacade;
import Presentation.PresentationFacade;

/**
 *
 */
public class Starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IBusiness business = BusinessFacade.getInstance();
        IData data = DataFacade.getInstance();
        IPresentation presentation = PresentationFacade.getInstance();
        
        presentation.injectBusiness(business);
        business.injectData(data);
        business.injectPresentation(presentation);
        data.injectBusiness(business);
        
        presentation.startApplication(args);
    }

}