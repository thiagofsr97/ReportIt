package business.control;


import business.model.Occurrence;

public class OccurrenceRegister{

    private OccurrenceManager occurrenceManager;
    private static OccurrenceRegister occurrenceRegister = null;
    private OccurrenceRegister(){
        this.occurrenceManager = OccurrenceManager.getInstance();
    }

    /*
     *
     * Applying Singleton Design Pattern
     *
     */

    public static OccurrenceRegister getInstance(){
        if(occurrenceRegister == null){
            occurrenceRegister = new OccurrenceRegister();
        }
        return occurrenceRegister;
    }

    public void register(Occurrence occurrence){
        this.occurrenceManager.insertOcurrence(occurrence);
    }
}