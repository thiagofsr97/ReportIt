package business.control;

import business.model.Local;
import business.model.LostItem;
import business.model.Occurrence;
import business.model.OccurrenceType;
import mapas.DateTime;

import java.util.ArrayList;
import java.util.List;

public class OccurrenceManager {
    
    private List<Occurrence> occurrences;
    private static OccurrenceManager occurrenceManager = null;

    private OccurrenceManager(){
        this.occurrences = new ArrayList<>();
    }

    /*
    *
    * Applying Singleton Design Pattern
    *
     */
    public static OccurrenceManager getInstance(){
        if(occurrenceManager == null){
            occurrenceManager = new OccurrenceManager();
        }

        return occurrenceManager;
    }

    private Occurrence findOccurence(int id){
        for (Occurrence occurence: this.occurrences) {
            if (id == occurence.getId()){
                return occurence;
            }
        }
        return null;

    }
    
    public void removeOccurrence(int id){
        Occurrence occurrence = findOccurence(id);
        if(occurrence != null){
            this.occurrences.remove(occurrence);
            System.out.println("Ocorrência de id: " + id + " foi removida com sucesso.");
        }else{
            System.out.println("Ocorrência de id: " + id + " não encontrada.");
        }

    }
    
    public void editOccurrence(int id, String description, Local local, DateTime dateTime, List<LostItem> lostItems, OccurrenceType occurrenceType){
        Occurrence occurrence = findOccurence(id);
        if(occurrence!=null){
            occurrence.setDescription(description);
            occurrence.setDateTime(dateTime);
            occurrence.setLostItems(lostItems);
            occurrence.setLocal(local);
            occurrence.setOccurrenceType(occurrenceType);
        }else{
            System.out.println("Ocorrência de id: " + id + " não encontrada.");
        }
        
    }
    
    public void insertOcurrence(Occurrence occurrence){
        this.occurrences.add(occurrence);
    }

    public Occurrence getOccurrence(int id){
        return findOccurence(id);
    }

    public void ListOccurencesById() {
        for (Occurrence occurrence : this.occurrences) {
            System.out.println("Occurence ID: " + occurrence.getId() + " Description:" + occurrence.getDescription());

        }
    }

}
