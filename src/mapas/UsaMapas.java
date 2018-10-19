/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapas;

import business.model.users.User;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author aluno
 */
public class UsaMapas { 
    
    public static void main(String args[]){
        
        //Adding users to hashmap
        Map<String, User> usersMap = new HashMap<>();
        UsersHandler.addUser(usersMap, "neymar", "10", new DateTime(24,12,97));
        UsersHandler.addUser(usersMap, "huck", "7", new DateTime(23,11,94));
        UsersHandler.addUser(usersMap, "cassio", "12",new DateTime(23,11,94));
        
        //UsersHandler.findAndRemove(usersMap, "huck");
        //UsersHandler.findAndEdit(usersMap, "huck", "edson", "1234", new DateTime(10,10,94));
        //UsersHandler.findAndRemove(usersMap, "edson");
        
        System.out.println("HashMap: ");
        UsersHandler.printOutUsers(usersMap);
        
        System.out.println("------------------------------------");
        
        //Adding same users to TreeMap using putAll
        Map<String, User> usersTreeMap = new TreeMap<>();
        usersTreeMap.putAll(usersMap);
        
        System.out.println("TreeMap: ");
        UsersHandler.printOutUsers(usersTreeMap);
        System.out.println("------------------------------------");      
        
        
        
    }
    
    

    
    
}
