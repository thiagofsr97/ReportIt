package business.control;

import business.model.Occurrence;

public abstract class Report {
    
    protected Occurrence _occurrence;
    private OccurrenceManager _occManager;
    
    
    public final void generateReport(OccurrenceManager occMan,int idOccurrence){
        this._occManager = occMan;
        getOccurrenceData(idOccurrence);
        reportFileType();
    }
    
    protected void getOccurrenceData(int idOccurrence){
        _occurrence = this._occManager.getOccurrence(idOccurrence);
        System.out.println("Obteve os dados da Occorrência.");
    }
    
    protected abstract void reportFileType();
    
}
