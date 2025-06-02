package aspectj.bean;

import org.springframework.stereotype.Component;

@Component("myCustomAlphaBean")
public class CustomAlphaBean {

    public void method1(){
        System.out.println("inside myCustomAlphaBean method1");
    }
}
