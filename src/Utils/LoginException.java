package Utils;

import business.model.users.User;

public class LoginException extends Exception {
    
    public LoginException (String erro)    {
        super(erro);
    }
    
    public LoginException(User user, String error){
        super("[User: " + user.getlogin() + "] - [Error]: " + error);
    }
    
}
