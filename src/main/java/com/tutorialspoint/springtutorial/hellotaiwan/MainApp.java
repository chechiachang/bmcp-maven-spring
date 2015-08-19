/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorialspoint.springtutorial.hellotaiwan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author davidchang
 */
public class MainApp {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        
        HelloTaiwan helloTaiwan = (HelloTaiwan)context.getBean("helloTaiwan");
        
        helloTaiwan.getMessage1();
        helloTaiwan.getMessage2();
        
        HelloJapan helloJapan = (HelloJapan)context.getBean("helloJapan");
        helloJapan.getMessage1();
        helloJapan.getMessage2();
        helloJapan.getMessage3();
    }
}
