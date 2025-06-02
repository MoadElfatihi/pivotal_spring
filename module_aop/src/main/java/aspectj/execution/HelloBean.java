package aspectj.execution;


import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class HelloBean {

    public void findEmployeeById(Long id) {
        System.out.println("findEmployeeById is executing");
    }

    public void findEmployeeByName(String name) {
        System.out.println("findEmployeeByName is executing");
    }

    public void getCurrencyCountryName(String currencyName){
        if(StringUtils.isEmpty(currencyName))
            throw new IllegalArgumentException("invalid currency name");
    }
}
