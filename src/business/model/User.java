package business.model;

import mapas.DateTime;

import java.io.Serializable;

public class User implements Comparable, Serializable {
    private final String login;
    private final String password;
    private final DateTime birthday;
    private static int idCount = 0;
    private int id;
    private int cpf;
    
    public User(String login, String password, DateTime birthday){
        this.login = login;
        this.password = password;
        this.birthday = birthday;
        this.id = idCount++;
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

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public int compareTo(Object o) {
        
       return this.login.compareTo(((User) o).getlogin());
        
    }
    
}
