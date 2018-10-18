package business.model;

import mapas.DateTime;


public class Administrator extends User {
    
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
