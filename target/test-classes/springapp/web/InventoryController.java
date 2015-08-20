/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springapp.web;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import springapp.service.ProductManager;

/**
 *
 * @author davidchang
 */
public class InventoryController implements Controller {

    protected final Log logger = LogFactory.getLog(getClass());

    private ProductManager productManager;

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        String now = (new java.util.Date()).toString();
        logger.info("returning hello view with " + now);
        
        Map<String, Object> myModel = new HashMap<>();
        myModel.put("now", now);
        myModel.put("products", this.productManager.getProducts());
        
        return new ModelAndView("hello", "model", myModel);
        
    }
    public void setProductManager(ProductManager productManager){
        this.productManager = productManager;
    }

}
