package business.control;

import business.model.Occurrence;
import mapas.DateTime;
import mapas.Usuario;


public class Administrator extends Usuario{
    
    private Occurrence manageOccurrence;

    public Occurrence getManageOccurrence() {
        return manageOccurrence;
    }

    public void setManageOccurrence(Occurrence manageOccurrence) {
        this.manageOccurrence = manageOccurrence;
    }
    
    public Administrator(String login, String password, DateTime birthday) {
        super(login, password, birthday);
    }
    
}
