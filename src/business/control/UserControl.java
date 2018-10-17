package business.control;

import Utils.LoginException;
import Utils.PasswordException;
import Utils.PersistenceException;
import infra.UserPersistence;
import java.util.HashMap;
import mapas.UsersHandler;
import mapas.Usuario;

public class UserControl {
    
    HashMap<String, Usuario> _user;
    UserPersistence _up;
    String _path = "src\\view\\teste.ser";
    
    
    public void checkFile() throws PersistenceException{
        _up = new UserPersistence(_path);
        
        if(_up.isFile(_path)){
            _up.setupLer(_path);
            if (_up.getContinua()){//caso o arquivo não esteja vazio, ele carregará o que tem salvo no arquivo
                _up.readRecords();
                _up.cleanupLer();
                _user = _up.getDadosUsuario();
            }
        }
        
        if(_user == null)
            _user = new HashMap<>();
    }
    
    public void add(Usuario usuario) throws LoginException, PasswordException{
        validaUsuario(usuario);
        _user.put(usuario.getlogin(), usuario);
    }

    public void removeUser(String login){
        UsersHandler.findAndRemove(_user, login);
    }
    
    private void validaUsuario(Usuario usuario) throws LoginException, PasswordException{
        validaLogin(usuario, usuario.getlogin());
        validaSenha(usuario, usuario.getPassword());
    }
    
    private void validaLogin(Usuario usuario,String login) throws LoginException{
        if(login.isEmpty())
            throw new LoginException(usuario, "Login vazio");
        if(login.length() > 15)
            throw new LoginException(usuario, "Login muito grande.");
        if(!login.matches("[a-zA-Z]+"))
            throw new LoginException(usuario, "Login possui caracter inválido.");
    }
    
    private void validaSenha(Usuario usuario, String senha) throws PasswordException{
        if(senha.length() < 6 || senha.length() > 16)
            throw new PasswordException("Senha deve possuir entre 6-16 caracteres.");
        if(!senha.matches("\\w*\\d[a-zA-Z]*"))
            throw new PasswordException("Senha deve possuir pelo menos um número.");
    }
    
    public void print(){
        UsersHandler.printOutUsers(_user);
    }
    
    public void close(){
        try {
            _up.setupGravar(_path);
            _up.addRecords1(_user);
            _up.cleanupGravar();
        } catch (PersistenceException ex) {
            //Logger.getLogger(UserControl.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        
    }
    
    
}
