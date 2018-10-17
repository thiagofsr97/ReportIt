package mapas;

import java.io.Serializable;

public class Usuario implements Comparable, Serializable {
    private final String login;
    private final String password;
    private final DateTime birthday;
    
    public Usuario(String login, String password, DateTime birthday){
        this.login = login;
        this.password = password;
        this.birthday = birthday;
    }
    
    public String getlogin(){
        return this.login;
    }
    public String getPassword(){
        return this.password;
    }
    
    public DateTime getBirthday(){
        return this.birthday;
    }

    @Override
    public int compareTo(Object o) {
        
       return this.login.compareTo(((Usuario) o).getlogin());
        
    }
    
    
}
