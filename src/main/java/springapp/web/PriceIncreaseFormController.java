/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springapp.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.view.RedirectView;
import springapp.service.PriceIncrease;
import springapp.service.ProductManager;

/**
 *
 * @author davidchang
 */
public class PriceIncreaseFormController {
    
    protected final Log logger = LogFactory.getLog(getClass());
    
    private ProductManager productManager;
    
    public ModelAndView onSubmit(Object command) throws ServletException{
        int increase = ((PriceIncrease) command).getPercentage();
        logger.info("Increasing prices by " + increase + "%");
        productManager.increasePrice(increase);
        return new ModelAndView(new RedirectView("hello"));
    }
    
    protected Object formBackingObject(HttpServletRequest request) throws ServletException{
        PriceIncrease priceIncrease = new PriceIncrease();
        priceIncrease.setPercentage(20);
        return priceIncrease;
    }

    public ProductManager getProductManager() {
        return productManager;
    }

    public void setProductManager(ProductManager productManager) {
        this.productManager = productManager;
    }
    
}
