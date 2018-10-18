/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapas;

import business.model.User;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author aluno
 */
public class UsersHandler {
    
      public static void addUser(Map usersMap, String login, String password, DateTime newBirthday){
        usersMap.put(login, new User(login, password, newBirthday));
    }
    public static void findAndEdit(Map usersMap, String oldLogin, String newLogin, String newPassword, DateTime newBirthday){
        if(usersMap.containsKey(oldLogin)){
            if(oldLogin.equals(newLogin)){
                usersMap.put(newLogin, new User(newLogin, newPassword, newBirthday));
            }else{
                usersMap.remove(oldLogin);
                usersMap.put(newLogin, new User(newLogin, newPassword, newBirthday));
            }
            
        }else{
            System.out.println("Usuário não encontrado.");
        }
    }
    
     public static void findAndRemove(Map usersMap, String login){
        if(usersMap.containsKey(login)){
            usersMap.remove(login);
        }else{
            System.out.println("Usuário não encontrado.");
        }
    }
    
    public static void printOutUsers(Map usersMap){
        
        Iterator<Map.Entry<Integer, User>> it = usersMap.entrySet().iterator();
        while(it.hasNext()){
            User user = it.next().getValue();
            System.out.println("User: " + user.getlogin() + " Senha: " + user.getPassword() + " Nascimento: " + user.getBirthday().toString());
            
        }
    }
    public static void printOutUsers(Set<User> usersSet){
        for(User user: usersSet){
            System.out.println("User: " + user.getlogin() + " Senha: " + user.getPassword() + " Nascimento: " + user.getBirthday().toString());
        }        
    }
    
   
    
}
