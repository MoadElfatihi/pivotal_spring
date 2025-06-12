package com.spring_pivotal.jdbcMethods;


import com.spring_pivotal.model.Employe;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Repository
public class EmployeJdbcTemplateDao {


    private final JdbcTemplate jdbcTemplate;


    public EmployeJdbcTemplateDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    public List<Employe> findEmployees() {
        return jdbcTemplate.query("select employee_id,first_name,last_name,email,phone_number,hire_date,salary from employee", this::mapEmployee);
    }


    public List<String> findEmployeesEmails() {
        return jdbcTemplate.queryForList("select email from employee", String.class);
    }
/*
    public Employe findEmployeeWithHighestSalary() {

    }

    public Employe findEmployeeById(Integer id) {

    }

    public Map<String, Object> findEmployeeThatWasHiredLast() {

    }

    public SqlRowSet findEmployeesEmailsAndPhones() {

    }

    public void insertNewDummyRecord() {

    }

    public int updateDummyRecord(Integer id, String firstName) {

    }

    public int[] updateRecordsWithDummyData() {

    }*/
    private Employe mapEmployee(ResultSet resultSet, int i) throws SQLException {
        return new Employe(
                resultSet.getInt("employee_id"),
                resultSet.getString("first_name"),
                resultSet.getString("last_name"),
                resultSet.getString("email"),
                resultSet.getString("phone_number"),
                resultSet.getDate("hire_date"),
                resultSet.getFloat("salary")
        );
    }
}
