package cglib.example;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DepartementAspect {

    @Around("@annotation(cglib.example.ToBeProxied)")
    public void logMethod(){
        System.out.println("inside the proxy");
    }
}
