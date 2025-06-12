package aspectj.forannotation;

import org.springframework.stereotype.Repository;

@MonitoredRepository
@Repository
public class DepartmentRepository {

    public Department findbyId(Long id){
        return new Department();
    }
}
