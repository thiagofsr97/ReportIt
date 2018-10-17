package business.model;

public class Assault implements OccorenceType {
    private String name;
    Assault(){
        this.name = "Assault";

    }
    @Override
    public String getOccorenceName() {
        return this.name;
    }
}
