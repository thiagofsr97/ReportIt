/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control.users;

import business.model.users.User;
import java.util.HashMap;

/**
 *
 * @author joaov
 */
public class UserMemento {
    HashMap<String, User> _user;

    public UserMemento(HashMap<String, User> _user) {
        this._user = _user;
    }
    
    public HashMap<String, User> getSavedState(){
        return _user;
    }
}
