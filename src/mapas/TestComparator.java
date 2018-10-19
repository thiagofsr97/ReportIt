/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapas;

import business.model.users.User;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author aluno
 */
public class TestComparator{  
    
    public static void main(String[] args) {
        Set<User> firstUserSet;
        Set<User> secondUserSet;
        
        //Adding users to Set to be compared by name
        firstUserSet = new TreeSet<User>(new NameComparator());
        firstUserSet.add(new User("Edson Filho", "123", new DateTime(25,10,94)));
        firstUserSet.add(new User("Edson Filho", "1234", new DateTime(25,8,94)));
        firstUserSet.add(new User("Thiago Pai", "123", new DateTime(23,8,94)));
        firstUserSet.add(new User("Joao Neto", "123", new DateTime(25,10,95)));
        
        //Adding users to Set to be compared by birthday
        secondUserSet = new TreeSet<User>(new BirthdayComparator());
        secondUserSet.addAll(firstUserSet);
        
        System.out.println("Sorted by NameComparator: ");
        UsersHandler.printOutUsers(firstUserSet);
        System.out.println("----------------------------------");
        System.out.println("Sorted by BirthdayComparator: ");
        UsersHandler.printOutUsers(secondUserSet);
        
    }
}
