/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springapp.service;

import java.util.List;
import springapp.domain.Product;

/**
 *
 * @author davidchang
 */
public class SimpleProductManager implements ProductManager{

    @Override
    public void increasePrice(int percentage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Product> getProducts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setProducts(List<Product> products){
        throw new UnsupportedOperationException();
    }
}
