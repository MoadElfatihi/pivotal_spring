
import aspectj.HelloBeanConfiguration;
import aspectj.execution.HelloBean;
import aspectj.within.HelloBeanWithin;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunnerWithin {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(HelloBeanConfiguration.class);
        var service = ctx.getBean(HelloBeanWithin.class);

        service.method1();
    }
}