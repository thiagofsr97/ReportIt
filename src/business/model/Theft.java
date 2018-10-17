package business.model;

public class Theft implements OccorenceType
{
    private String name;
    Theft(){
        this.name = "Theft";
    }
    @Override
    public String getOccorenceName() {
        return this.name;
    }
}
