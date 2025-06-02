
import aspectj.execution.HelloBean;
import aspectj.HelloBeanConfiguration;
import aspectj.execution.sub.SubHelloBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(HelloBeanConfiguration.class);
        var service = ctx.getBean(HelloBean.class);
        service.findEmployeeById(1L);
        service.findEmployeeByName("test");
        System.out.println("********");

        var subHelloBBean = ctx.getBean(SubHelloBean.class);
        subHelloBBean.formatData();
    }
}