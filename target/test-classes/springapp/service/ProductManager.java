/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springapp.service;

import java.io.Serializable;
import java.util.List;
import springapp.domain.Product;

/**
 *
 * @author davidchang
 */
public interface ProductManager extends Serializable{
    public void increasePrice(int percentage);
    public List<Product> getProducts();
}
