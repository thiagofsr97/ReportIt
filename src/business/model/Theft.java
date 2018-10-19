package business.model;

public class Theft extends OccurrenceType
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
