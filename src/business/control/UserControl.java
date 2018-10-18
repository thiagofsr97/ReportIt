package business.control;

import Utils.LoginException;
import Utils.PasswordException;
import Utils.PersistenceException;
import business.model.User;
import infra.FilePersistence;
import java.util.HashMap;
import mapas.UsersHandler;

public class UserControl {
    
    HashMap<String, User> _user;
    FilePersistence _up;
    String _path = "src\\view\\teste.ser";

    UserControl() throws PersistenceException {
        this._up = new FilePersistence(this._path);
        this._user = this._up.loadFromDatabase();
    }
    
    public void add(User user) throws LoginException, PasswordException{
        validaUsuario(user);
        _user.put(user.getlogin(), user);
    }

    public void removeUser(String login){
        UsersHandler.findAndRemove(_user, login);
    }
    
    private void validaUsuario(User user) throws LoginException, PasswordException{
        validaLogin(user, user.getlogin());
        validaSenha(user, user.getPassword());
    }
    
    private void validaLogin(User user, String login) throws LoginException{
        if(login.isEmpty())
            throw new LoginException(user, "Login vazio");
        if(login.length() > 15)
            throw new LoginException(user, "Login muito grande.");
        if(!login.matches("[a-zA-Z]+"))
            throw new LoginException(user, "Login possui caracter inválido.");
    }
    
    private void validaSenha(User user, String senha) throws PasswordException{
        if(senha.length() < 6 || senha.length() > 16)
            throw new PasswordException("Senha deve possuir entre 6-16 caracteres.");
        if(!senha.matches("\\w*\\d[a-zA-Z]*"))
            throw new PasswordException("Senha deve possuir pelo menos um número.");
    }
    
    public void print(){
        UsersHandler.printOutUsers(_user);
    }
    
    public void close() throws PersistenceException{
        this._up.saveOnDatabase(this._user);
        
    }
    
    
}
