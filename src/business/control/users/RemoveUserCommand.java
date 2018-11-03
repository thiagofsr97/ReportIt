/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control.users;

import Utils.LoginException;
import Utils.PasswordException;
import static business.control.users.UserControl.memento;
import business.model.users.User;
import java.util.HashMap;
import mapas.UsersHandler;

/**
 *
 * @author joaov
 */
public class RemoveUserCommand implements Command{

    @Override
    public HashMap<String, User> executarAcao(User user, HashMap<String, User> _user) throws LoginException, PasswordException{
        
        HashMap<String, User> state = _user;
        if(UsersHandler.findAndRemove(state, user.getlogin())){
            UserControl.addMemento();
            return state;
        }
        return _user;
    }

    
    
}
