package business.control;


import business.model.Occurrence;

public class OccurenceRegister{

    private OccurrenceManager occurrenceManager;
    OccurenceRegister(OccurrenceManager occurrenceManager){
        this.occurrenceManager = occurrenceManager;
    }

    public void register(Occurrence occurrence){
        this.occurrenceManager.insertOcurrence(occurrence);

    }
}
