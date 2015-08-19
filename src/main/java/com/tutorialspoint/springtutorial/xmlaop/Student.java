/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorialspoint.springtutorial.xmlaop;

/**
 *
 * @author davidchang
 */
public class Student {

    private Integer age;
    private String name;

    public Integer getAge() {
        System.out.println("Age : " + age);
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        System.out.println("Name : " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printThrowException(){
        System.out.println("Exception raised.");
        throw new IllegalArgumentException();
    }
}
