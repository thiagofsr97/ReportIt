package mapas;

import java.io.Serializable;

public class Usuario implements Comparable, Serializable {
    private final String login;
    private final String password;
    private final DateTime birthday;
    private int id;
    private int cpf;
    
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public int compareTo(Object o) {
        
       return this.login.compareTo(((Usuario) o).getlogin());
        
    }
    
}
