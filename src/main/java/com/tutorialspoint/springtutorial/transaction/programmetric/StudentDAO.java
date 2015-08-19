/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorialspoint.springtutorial.transaction.programmetric;

import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author davidchang
 */
public interface StudentDAO {
    public void setDataSource(DataSource ds);
    public void create(String name, Integer age , Integer marks, Integer year);
    public List<StudentMarks>ListStudents();
}
