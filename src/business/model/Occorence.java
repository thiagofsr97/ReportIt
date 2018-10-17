package business.model;

import mapas.DateTime;

import java.util.ArrayList;
import java.util.List;

public class Occorence {

    private String description;
    private DateTime dateTime;
    private List<String> lostItems;
    private Local local;
    private OccorenceType occorenceType;

    Occorence(String description, DateTime dateTime, Local local, OccorenceType occorenceType){
        this.description = description;
        this.dateTime = dateTime;
        this.local = local;
        this.lostItems = new ArrayList<>();
        this.occorenceType = occorenceType;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;
    }


    public List<String> getLostItems() {
        return lostItems;
    }

    public void addLostItem(String lostItem) {
        this.lostItems.add(lostItem);
    }

    public OccorenceType getOccorenceType() {
        return occorenceType;
    }

    public void setOccorenceType(OccorenceType occorenceType) {
        this.occorenceType = occorenceType;
    }

    public void clearItems(){
        this.lostItems.clear();
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

}
