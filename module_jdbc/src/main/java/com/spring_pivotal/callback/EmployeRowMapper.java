package com.spring_pivotal.callback;

import com.spring_pivotal.model.Employe;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;


@Component
public class EmployeRowMapper implements RowMapper<Employe> {


    @Override
    public Employe mapRow(ResultSet resultSet, int i) throws SQLException {
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
