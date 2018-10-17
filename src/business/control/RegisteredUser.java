package business.control;

import mapas.DateTime;
import mapas.Usuario;

public class RegisteredUser extends Usuario{
    
    public RegisteredUser(String login, String password, DateTime birthday) {
        super(login, password, birthday);
    }
    
}
