/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccc.bmcp.maven.spring.helloworld;

/**
 *
 * @author davidchang
 */
public class HelloWorld {
    private String message;

    public void getMessage() {
        System.out.println("Your message : " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public void init(){
        System.out.println("Bean is going through init.");
    }
    
    public void destroy(){
        System.out.println("Bean will destroy now.");
    }
    
}
