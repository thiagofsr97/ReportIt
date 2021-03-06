package business.control.users;

import Utils.LoginException;
import Utils.PasswordException;
import Utils.PersistenceException;
import business.model.users.User;
import infra.persistence.FilePersistence;
import java.util.HashMap;
import mapas.UsersHandler;

public class UserControl {
    
    private static HashMap<String, User> _user;
    protected static MementoCareTaker memento;
    FilePersistence _up;
    String _path = "src\\databasefiles\\teste.ser";

    public UserControl() throws PersistenceException {
        this._up = new FilePersistence(this._path);
        this._user = this._up.loadFromDatabase();
        memento = new MementoCareTaker();
        memento.addMemento(new UserMemento(_user));
    }
    
    public static void addMemento(){
        memento.addMemento(new UserMemento(_user));
    }
    
    public void executarAcao(User user, Command command) throws LoginException, PasswordException{
        _user = command.executarAcao(user, _user);
    }
    
    public void undo (){
        _user = memento.getLastSavedState().getSavedState();
    }
    
    public static void validaUsuario(User user) throws LoginException, PasswordException{
        validaLogin(user, user.getlogin());
        validaSenha(user, user.getPassword());
    }
    
    private static void validaLogin(User user, String login) throws LoginException{
        if(login.isEmpty())
            throw new LoginException(user, "Login vazio");
        if(login.length() > 15)
            throw new LoginException(user, "Login muito grande.");
        if(!login.matches("[a-zA-Z]+"))
            throw new LoginException(user, "Login possui caracter inválido.");
    }
    
    private static void validaSenha(User user, String senha) throws PasswordException{
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
