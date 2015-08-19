/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccc.springtutorial.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author davidchang
 */
public class MainApp {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        
        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        
        helloWorld.setMessage("Hello World!");
        helloWorld.getMessage();
    }
}
