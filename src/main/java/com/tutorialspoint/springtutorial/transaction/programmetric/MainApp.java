/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorialspoint.springtutorial.transaction.programmetric;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author davidchang
 */
public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("transaction.xml");
        StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");

        System.out.println("------Records ceation------");
        studentJDBCTemplate.create("Zara", 11, 99, 2010);
        studentJDBCTemplate.create("Nyha", 20, 97, 2010);
        studentJDBCTemplate.create("Ayan", 25, 100, 2011);

        System.out.println("------Listing all the records------");
        List<StudentMarks> listStudentMarks = studentJDBCTemplate.ListStudents();
        for (StudentMarks studentMarks : listStudentMarks) {
            System.out.println(
                    "ID : " + studentMarks.getId()
                    + ", Name : " + studentMarks.getName()
                    + ", Marks : " + studentMarks.getMarks()
                    + ", Year : " + studentMarks.getYear()
                    + ", Age : " + studentMarks.getAge());
        }
    }
}
