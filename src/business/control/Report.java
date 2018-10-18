package business.control;

import business.model.Occurrence;

public abstract class Report {
    
    protected Occurrence occurrence;
    
    public final void generateReport(int idOccurrence){
        getOccurrenceData(idOccurrence);
        reportFileType();
    }
    
    protected void getOccurrenceData(int idOccurrence){
        occurrence = OccurrenceManager.getOcorrencia(idOccurrence);
        System.out.println("Obteve os dados da Occorrência.");
    }
    
    protected abstract void reportFileType();
    
}
