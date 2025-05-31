import cglib.example.CglibProxyConfig;
import cglib.example.DepartementService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(CglibProxyConfig.class);
        DepartementService service = ctx.getBean(DepartementService.class);
        service.findById(1L);
    }
}