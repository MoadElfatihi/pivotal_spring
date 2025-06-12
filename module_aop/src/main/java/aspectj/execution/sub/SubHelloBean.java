package aspectj.execution.sub;

import org.springframework.stereotype.Component;

@Component
public class SubHelloBean {

    public void formatData(){
        System.out.println("formatData executed...");
    }
}
