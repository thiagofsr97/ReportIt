package business.model;

public class Theft implements OccurrenceType
{
    private String name;
    Theft(){
        this.name = "Theft";
    }
    @Override
    public String getOccurrenceName() {
        return this.name;
    }
}
