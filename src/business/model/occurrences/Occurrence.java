package business.model.occurrences;

import business.model.local.Local;
import business.model.lostitems.LostItem;
import mapas.DateTime;

import java.util.ArrayList;
import java.util.List;

public class Occurrence {

    private String description;
    private DateTime dateTime;
    private List<LostItem> lostItems;
    private Local local;
    private OccurrenceType occurrenceType;
    private static int idCount = 0;
    private final int id;


    public Occurrence(String description, DateTime dateTime, Local local, OccurrenceType occurenceType){
        this.description = description;
        this.dateTime = dateTime;
        this.local = local;
        this.lostItems = new ArrayList<>();
        this.occurrenceType = occurenceType;
        this.id = idCount++;

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

    public List<LostItem> getLostItems() {
        return lostItems;
    }

    public void addLostItem(LostItem lostItem) {
        this.lostItems.add(lostItem);
    }
    public void setLostItems(List<LostItem> lostItems){this.lostItems = lostItems;}

    public OccurrenceType getOccorenceType() {
        return this.occurrenceType;
    }

    public void setOccurrenceType(OccurrenceType occurrenceType) {
        this.occurrenceType = occurrenceType;
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
    
    public int getId() {
        return id;
    }

}
