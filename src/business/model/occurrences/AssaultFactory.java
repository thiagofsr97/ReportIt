package business.model.occurrences;

public class AssaultFactory implements OccurrenceTypeFactory {
    @Override
    public OccurrenceType getInstance() {
        return new Assault();
    }
}
