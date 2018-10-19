package business.model;

public class TheftFactory implements OccurrenceTypeFactory {
    @Override
    public OccurrenceType getInstance() {
        return new Theft();
    }
}
