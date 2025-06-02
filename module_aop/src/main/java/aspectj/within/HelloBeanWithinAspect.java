package aspectj.within;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class HelloBeanWithinAspect {

    @Before("within(aspectj..HelloBeanWithin)")
    public void withinExample1() {
        System.out.println("Before - withinExample1");
    }

    @Before("within(aspectj..*)")
    public void withinExample2() {
        System.out.println("Before - withinExample2");
    }

    @Before("within(com..Hello*Bean)")
    public void withinExample3() {
        System.out.println("Before - withinExample3");
    }
}
