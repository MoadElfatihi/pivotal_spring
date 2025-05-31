package cglib.example;

import org.springframework.stereotype.Service;

@Service
public class DepartementService {

    @ToBeProxied
    public Departement findById(Long id){
        return new Departement();
    }
}
