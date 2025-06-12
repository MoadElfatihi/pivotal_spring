package adviceType;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeRepositoryImpl {

    public Employe findById(Long id){
        if(id==null || id <0){
            throw new IllegalArgumentException("id is not valid");
        }
        return new Employe(id);
    }
}

class Employe {
    Long id;

    Employe(Long id){
        this.id = id;
    }
}