package business.control;


import business.model.Occurrence;

public class OccurrenceRegister{

    private OccurrenceManager occurrenceManager;
    OccurrenceRegister(OccurrenceManager occurrenceManager){
        this.occurrenceManager = occurrenceManager;
    }

    public void register(Occurrence occurrence){
        this.occurrenceManager.insertOcurrence(occurrence);

    }
}
