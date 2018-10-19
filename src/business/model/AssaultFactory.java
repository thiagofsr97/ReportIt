package business.model;

public class AssaultFactory implements OccurrenceTypeFactory {
    @Override
    public OccurrenceType getInstance() {
        return new Assault();
    }
}
