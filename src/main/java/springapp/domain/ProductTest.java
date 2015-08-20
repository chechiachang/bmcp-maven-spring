/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springapp.domain;

import junit.framework.TestCase;
import springapp.domain.Product;

/**
 *
 * @author davidchang
 */
public class ProductTest extends TestCase{
    private Product product;
    @Override
    protected void setUp() throws Exception{
        product = new Product();
    }
    public void testSetAndGetDescription(){
        String testDescription = "aDescription";
        assertNull(product.getDescription());
        product.setDescription(testDescription);
        assertEquals(testDescription, product.getDescription());
    }
    public void testSetAndGetPrice(){
        double testPrice = 100.00;
        assertEquals(0,0,0);
        product.setPrice(testPrice);
        assertEquals(testPrice, product.getPrice(), 0);
        
    }
}
