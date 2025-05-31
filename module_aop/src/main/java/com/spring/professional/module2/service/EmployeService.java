package com.spring.professional.module2.service;

import com.spring.professional.module2.custom.PerformanceLogger;
import org.springframework.stereotype.Component;

@Component
public class EmployeService {

    @PerformanceLogger
    public void fetchResult(){
        System.out.println("fetch employees...");
    }
}
