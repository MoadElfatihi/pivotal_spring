package aspectj.forannotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DepartmentAspect {

    @Before("@within(aspectj.forannotation.MonitoredRepository)")
    public void beforeAnyMethodAnnotatedClass(){
        System.out.println("before the monitored repository...");
    }
}
