/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccc.bmcp.maven.spring.hellotaiwan;

/**
 *
 * @author davidchang
 */
public class HelloJapan {

    private String message1;
    private String message2;
    private String message3;

    public void getMessage1() {
        System.out.println("Japan Message1 : " + message1);
    }

    public void setMessage1(String message1) {
        this.message1 = message1;
    }

    public void getMessage2() {
        System.out.println("Japan Message2 : " + message2);
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    public void getMessage3() {
        System.out.println("India message3 : " + message3);
    }

    public void setMessage3(String message3) {
        this.message3 = message3;
    }

}