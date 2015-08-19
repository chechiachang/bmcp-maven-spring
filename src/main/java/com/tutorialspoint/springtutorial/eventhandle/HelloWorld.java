/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorialspoint.springtutorial.eventhandle;

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

}
