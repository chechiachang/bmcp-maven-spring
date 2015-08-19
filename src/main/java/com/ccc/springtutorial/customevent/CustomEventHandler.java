/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccc.springtutorial.customevent;

import org.springframework.context.ApplicationListener;

/**
 *
 * @author davidchang
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        System.out.println(customEvent.toString());
    }

}
