/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccc.springtutorial.innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author davidchang
 */
public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("innerBean.xml");
        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        
        SpellChecker spellChecker = null;
        textEditor.setSpellChecker(spellChecker);
        textEditor.getSpellChecker();
        textEditor.spellCheck();
    }

}
