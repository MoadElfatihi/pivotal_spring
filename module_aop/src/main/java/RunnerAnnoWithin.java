import aspectj.HelloBeanConfiguration;
import aspectj.execution.HelloBean;
import aspectj.execution.sub.SubHelloBean;
import aspectj.forannotation.DepartmentRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunnerAnnoWithin {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(HelloBeanConfiguration.class);
        DepartmentRepository repo = ctx.getBean(DepartmentRepository.class);
        repo.findbyId(1L);
    }
}