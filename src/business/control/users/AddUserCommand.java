/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control.users;

import Utils.LoginException;
import Utils.PasswordException;
import business.model.users.User;
import java.util.HashMap;

/**
 *
 * @author joaov
 */
public class AddUserCommand implements Command{

    @Override
    public HashMap<String, User> executarAcao(User user, HashMap<String, User> _user)
                                            throws LoginException, PasswordException{
        
        UserControl.validaUsuario(user);
        UserControl.addMemento();
        _user.put(user.getlogin(), user);
        
        return _user;
    }

    
}
