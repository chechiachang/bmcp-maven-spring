/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccc.springtutorial.jdbc;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author davidchang
 */
public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
        StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");

        System.out.println("------Recoreds Creation------");
        studentJDBCTemplate.create("Zara", 11);
        studentJDBCTemplate.create("Nuha", 2);
        studentJDBCTemplate.create("Ayan", 15);

        System.out.println("------Listing Multiple Records------");
        List<Student> students = studentJDBCTemplate.listStudents();
        for (Student student : students) {
            System.out.println("ID : " + student.getId()
                    + " Name : " + student.getName()
                    + " Age : " + student.getAge());
        }

        System.out.println("------Updating Record with ID = 2 ------");
        studentJDBCTemplate.update(2, 20);

        System.out.println("------Listing Record with ID = 2 ------");
        Student student = studentJDBCTemplate.getStudent(2);
        System.out.println("ID :" + student.getId() + ", Name : " + student.getName() + ", Age : " + student.getAge());
    }
}
