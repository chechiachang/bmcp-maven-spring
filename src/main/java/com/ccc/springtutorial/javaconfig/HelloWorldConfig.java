/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccc.springtutorial.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author davidchang
 */
@Configuration
public class HelloWorldConfig {
    
    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
}
