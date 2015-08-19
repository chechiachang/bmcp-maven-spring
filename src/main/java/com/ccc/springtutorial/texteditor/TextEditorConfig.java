/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccc.springtutorial.texteditor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author davidchang
 */
@Configuration
public class TextEditorConfig {
    
    @Bean
    public TextEditor textEditor(){
        return new TextEditor(spellChecker());
    }
    @Bean
    public SpellChecker spellChecker(){
        System.out.println("Inside TextEditor constructor.");
        return new SpellChecker();
    }

}
