/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorialspoint.springtutorial.jdbc;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author davidchang
 */
public class StudentJDBCTemplate implements StudentDAO {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    @Override
    public void create(String name, Integer age) {
        String sql = "INSERT INTO `student` (name, age) VALUES (?,?)";
        jdbcTemplateObject.update(sql, name, age);
        System.out.println("Created record Name = " + name + " Age = " + age);
    }

    @Override
    public Student getStudent(Integer id) {
        String sql = "SELECT * FROM `student` WHERE `id` = ?";
        Student student = jdbcTemplateObject.queryForObject(sql, new Object[]{id}, new StudentMapper());
        return student;
    }

    @Override
    public List<Student> listStudents() {
        String sql = "SELECT * FROM `student`";
        List<Student> students = jdbcTemplateObject.query(sql, new StudentMapper());
        return students;
    }

    @Override
    public void delete(Integer id) {
        String sql = "DELETE FROM `student` WHERE `id` = ?";
        jdbcTemplateObject.update(sql, id);
    }

    @Override
    public void update(Integer id, Integer age) {
        String sql = "UPDATE `student` SET `age` = ? WHERE `id` = ?";
        jdbcTemplateObject.update(sql, age, id);
        System.out.println("Updated Record with ID = " + id);
    }

}
