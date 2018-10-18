package business.control;

import business.model.Occurrence;
import java.util.List;

public class OccurrenceManager {
    
    List<Occurrence> occurrences;
    
    public void removerOcorrencia(int id){
        occurrences.remove(id);
    }
    
    public void editarOcorrencia(int id){
        
    }
    
    public void inserirOcorrencia(){
        
    }
    
    public Occurrence getOcorrencia(){
        // mudar
        return null;
    }
}
