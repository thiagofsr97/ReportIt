package Utils;

import mapas.Usuario;

public class LoginException extends Exception {
    
    public LoginException (String erro)    {
        super(erro);
    }
    
    public LoginException(Usuario usuario, String error){
        super("[Usuario: " + usuario.getlogin() + "] - [Error]: " + error);
    }
    
}
