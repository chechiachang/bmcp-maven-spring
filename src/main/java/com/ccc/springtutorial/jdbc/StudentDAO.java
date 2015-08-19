/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccc.springtutorial.jdbc;

import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author davidchang
 */
public interface StudentDAO {
    public void setDataSource(DataSource dataSource);
    public void create (String name, Integer age);
    public Student getStudent(Integer id);
    public List<Student> listStudents();
    public void delete(Integer id);
    public void update (Integer id, Integer age);
}
