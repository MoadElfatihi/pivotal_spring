package adviceType;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeAspect {

    @Before("execution(* adviceType.EmployeRepositoryImpl.findById(..))")
    public void beforeAnyEmployeMethod(){
        System.out.println("Before aspect ....");
    }

    @After("execution(* adviceType.EmployeRepositoryImpl.findById(..))")
    public void afterAnyEmployeMethod(){
        System.out.println("After aspect ....");
    }

    @AfterThrowing("")
    public void afterThrowingException(){

    }
}
