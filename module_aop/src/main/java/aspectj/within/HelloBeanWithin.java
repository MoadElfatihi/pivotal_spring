package aspectj.within;

import org.springframework.stereotype.Component;

@Component
public class HelloBeanWithin {

    public void method1(){
        System.out.println("method1");
    }
}
