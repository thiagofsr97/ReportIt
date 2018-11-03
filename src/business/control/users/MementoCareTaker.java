
package business.control.users;

import java.util.HashMap;

/**
 *
 * @author joaov
 */
public class MementoCareTaker {
    protected UserMemento user;

    public MementoCareTaker() {
        user = new UserMemento(new HashMap<>());
    }
    
    public void addMemento(UserMemento userMemento){
        this.user = userMemento;
    }
    
    public UserMemento getLastSavedState(){
        return user;
    }
}
