package business.model.occurrences;

public class TheftFactory implements OccurrenceTypeFactory {
    @Override
    public OccurrenceType getInstance() {
        return new Theft();
    }
}
