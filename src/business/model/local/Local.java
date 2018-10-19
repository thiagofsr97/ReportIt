package business.model.local;

public class Local {
    private String latitude;
    private String longitude;
    private String adddress;
    private int CEP;

    Local(int CEP){
        this.CEP = CEP;
        this.latitude = "Get From Google API";
        this.longitude = "Get From Google API";
        this.adddress = "Get From Google API";
    }


    public String getLongitude() {
        return longitude;
    }

    public String getAdddress() {
        return adddress;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public String getLatitude() {
        return latitude;
    }

}
