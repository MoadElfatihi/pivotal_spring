package com.spring_pivotal;

import com.spring_pivotal.dao.EmployeeDao;
import com.spring_pivotal.jdbcMethods.EmployeJdbcTemplateDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.spring_pivotal.service.EmployeeReportService;

@ComponentScan
public class Runner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Runner.class);
        context.registerShutdownHook();

        /*EmployeeDao employeDao = context.getBean(EmployeeDao.class);
        employeDao.findEmployeeEmails().forEach(System.out::println);
        System.out.println("Average employe salary= "+employeDao.findAverageSalaryRowByRow());
        */

        EmployeJdbcTemplateDao  employeJdbc = context.getBean(EmployeJdbcTemplateDao.class);
        employeJdbc.findEmployees().forEach(System.out::println);

        System.out.println("Emoloyee email");

        employeJdbc.findEmployeesEmails().forEach(System.out::println);
    }
}
