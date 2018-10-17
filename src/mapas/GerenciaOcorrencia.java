package mapas;

import business.model.Occurrence;
import java.util.List;

public class GerenciaOcorrencia {
    
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
