/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccc.springtutorial.xmlaop;

/**
 *
 * @author davidchang
 */
public class Logging {

    public void beforeAdvice() {
        System.out.println("Going to setup student profile.");
    }

    public void afterAdvice() {
        System.out.println("Student profile has been setup.");
    }

    public void afterReturningAdvice(Object retVal) {
        System.out.println("Returning:" + retVal.toString());
    }

    public void afterThrowingAdvice(IllegalArgumentException ex) {
        System.out.println("There has been an Exception: " + ex.toString());
    }
}
