package aspectj.bean;

import org.springframework.stereotype.Component;

@Component("myCustomBean")
public class CustomBean {

    public void method1(){
        System.out.println("inside myCustomBean method1");
    }
}
