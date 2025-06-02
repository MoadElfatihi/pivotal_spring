package aspectj.bean;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CustomBeanAspect {

    @Before("bean(myCustomBean)")
    public void beforeMethodMyCustomBean(){
        System.out.println("method in MyCustomBean intercepted...");
    }

    @After("bean(myCustom*Bean)")
    public void afterMethodMyCustomBean(){
        System.out.println("method in Alpha Bean intercepted...");
    }
}
