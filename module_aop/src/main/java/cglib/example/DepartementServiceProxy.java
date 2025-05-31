package cglib.example;

/*
    what spring is doing behind the scenes for cglib proxy :
     creating a class that inherit from the target => which means that the target must no be final
     we can understand also as a consequence that the method must not be final to be proxied
 */
public class DepartementServiceProxy extends DepartementService{

    @Override
    public Departement findById(Long id) {
        return super.findById(id);
    }
}
