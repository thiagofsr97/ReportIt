package business.model;

public class Assault implements OccurrenceType {
    private String name;
    Assault(){
        this.name = "Assault";

    }
    @Override
    public String getOccurrenceName() {
        return this.name;
    }
}
