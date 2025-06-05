package com.spring_pivotal.dao;

import com.spring_pivotal.callback.AverageSalaryRowCallbackHandler;
import com.spring_pivotal.callback.EmployeRowMapper;
import com.spring_pivotal.model.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class EmployeeDao {
    private JdbcTemplate jdbcTemplate;
    private EmployeRowMapper mapper;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Autowired
    public void setEmployeRowMapper(EmployeRowMapper mapper) {
        this.mapper = mapper;
    }


    public List<Employe> findEmployeeEmails() {
        return jdbcTemplate.query(
                "SELECT employee_id, first_name, last_name, email, phone_number, hire_date, salary from employee",
                mapper::mapRow
        );
    }

    public float findAverageSalaryRowByRow() {
        AverageSalaryRowCallbackHandler averageSalaryRowCallbackHandler = new AverageSalaryRowCallbackHandler();

        jdbcTemplate.query(
                "select salary from employee",
                averageSalaryRowCallbackHandler
        );

        return averageSalaryRowCallbackHandler.getAverageSalary();
    }
}
