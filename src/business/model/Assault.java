package business.model;

public class Assault extends OccurrenceType {
    private String name;
    Assault(){
        this.name = "Assault";

    }
    @Override
    public String getOccurrenceName() {
        return this.name;
    }
}
