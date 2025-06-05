package com.spring_pivotal;

import com.spring_pivotal.dao.EmployeeDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.spring_pivotal.service.EmployeeReportService;

@ComponentScan
public class Runner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Runner.class);
        context.registerShutdownHook();

        EmployeeDao employeDao = context.getBean(EmployeeDao.class);
        employeDao.findEmployeeEmails().forEach(System.out::println);
        System.out.println("Average employe salary= "+employeDao.findAverageSalaryRowByRow());
    }
}
