/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springapp.service;

import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;
import org.junit.Test;
import springapp.domain.Product;

/**
 *
 * @author davidchang
 */
public class TestSimpleProductManager extends TestCase{
    private SimpleProductManager productManager;
    private List<Product> products;
    
    private static final int PRODUCT_COUNT = 2;
    
    private static final Double CHAIR_PRICE = 20.50;
    private static final String CHAIR_DESCRIPTION = "Chair";
    
    private static final String TABLE_DESCRIPTION = "Table";
    private static final Double TABLE_PRICE = 150.10;
    
    private static final  int POSITIVE_PRICE_INCREASE = 10;
    
    @Test
    @Override
    protected void setUp() throws Exception{
        productManager = new SimpleProductManager();
        products = new ArrayList<>();
        
        Product product = new Product();
        product.setDescription("Chair");
        product.setPrice(CHAIR_PRICE);
        products.add(product);
        
        product = new Product();
        product.setDescription("Table");
        product.setPrice(TABLE_PRICE);
        products.add(product);
        
        productManager.setProducts(products);
    }
    
    @Test
    public void testGetProductsWithNoProducts(){
        productManager = new SimpleProductManager();
        assertNull(productManager.getProducts());
    }
    
    @Test
    public void testGetProducts(){
        List<Product> products = productManager.getProducts();
        assertNotNull(products);
        assertEquals(PRODUCT_COUNT, productManager.getProducts().size());
        
        Product product = products.get(0);
        assertEquals(CHAIR_DESCRIPTION, product.getDescription());
        assertEquals(CHAIR_PRICE, product.getPrice());
        
        product = products.get(1);
        assertEquals(TABLE_DESCRIPTION, product.getDescription());
        assertEquals(TABLE_PRICE, product.getPrice());
    }
    public void testIncreasePriceWithNullListOfProducts(){
        try{
            productManager = new SimpleProductManager();
            productManager.increasePrice(POSITIVE_PRICE_INCREASE);
        }catch(NullPointerException ex){
            fail("Products list is null.");
        }
    }
}
