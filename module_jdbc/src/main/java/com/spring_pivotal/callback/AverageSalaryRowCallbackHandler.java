package com.spring_pivotal.callback;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class AverageSalaryRowCallbackHandler implements RowCallbackHandler {

    private float salarySum = 0;
    private int salariesCount = 0;

    @Override
    public void processRow(ResultSet resultSet) throws SQLException {
        salarySum += resultSet.getFloat("salary");
        ++salariesCount;
    }

    public float getAverageSalary() {
        return salarySum / (float) salariesCount;
    }
}
