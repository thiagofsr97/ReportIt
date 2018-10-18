package business.model;

import mapas.DateTime;

public class RegisteredUser extends User {
    
    public RegisteredUser(String login, String password, DateTime birthday) {
        super(login, password, birthday);
    }
    
}
