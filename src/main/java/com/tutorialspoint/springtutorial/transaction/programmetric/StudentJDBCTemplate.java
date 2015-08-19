/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorialspoint.springtutorial.transaction.programmetric;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/**
 *
 * @author davidchang
 */
public class StudentJDBCTemplate implements StudentDAO {

    private DataSource ds;
    private JdbcTemplate jtObj;
    private PlatformTransactionManager transactionManager;

    @Override
    public void setDataSource(DataSource ds) {
        this.ds = ds;
        this.jtObj = new JdbcTemplate(ds);
    }

    @Override
    public void create(String name, Integer age, Integer marks, Integer year) {
        TransactionDefinition def = new DefaultTransactionDefinition();
        TransactionStatus status = transactionManager.getTransaction(def);

        try {
            String insertStudentSql = "INSERT INTO `student` (name, age) VALUES (?, ?)";
            jtObj.update(insertStudentSql, name, age);

            String selectMaxIdSql = "SELECT max(id) FROM `student`";
            //deprecated since version 3.2.2
            //int sid = jtObj.queryForInt(selectMaxIdSql);
            int sid = jtObj.queryForObject(selectMaxIdSql, Integer.class);

            String insertMarksSql = "INSERT INTO `marks` (sid, marks, year) VALUE (?, ?, ?)";
            jtObj.update(insertMarksSql, sid, marks, year);

            System.out.println("Created Name = " + name + ", Age" + age);
            transactionManager.commit(status);
        } catch (DataAccessException ex) {
            System.out.println("Error in createing record, rolling back.");
            transactionManager.rollback(status);
            throw ex;
        }
    }

    @Override
    public List<StudentMarks> ListStudents() {
        String selectSql = "SELECT * FROM `student`, `marks` WHERE `student`.`id` = `marks`.`sid`";
        List<StudentMarks> studentMarks = jtObj.query(selectSql, new StudentMarksMapper());
        return studentMarks;
    }

    public void setTransactionManager(PlatformTransactionManager transactionManager){
        this.transactionManager = transactionManager;
    }
}
