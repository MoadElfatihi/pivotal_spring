import aspectj.HelloBeanConfiguration;
import aspectj.bean.CustomAlphaBean;
import aspectj.bean.CustomBean;
import aspectj.execution.HelloBean;
import aspectj.execution.sub.SubHelloBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunnerBean {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(HelloBeanConfiguration.class);
        var service = ctx.getBean(CustomAlphaBean.class);
        service.method1();

    }
}