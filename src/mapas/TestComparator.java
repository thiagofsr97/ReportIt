/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapas;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author aluno
 */
public class TestComparator{  
    
    public static void main(String[] args) {
        Set<Usuario> firstUserSet;
        Set<Usuario> secondUserSet;
        
        //Adding users to Set to be compared by name
        firstUserSet = new TreeSet<Usuario>(new NameComparator());
        firstUserSet.add(new Usuario("Edson Filho", "123", new DateTime(25,10,94)));
        firstUserSet.add(new Usuario("Edson Filho", "1234", new DateTime(25,8,94)));
        firstUserSet.add(new Usuario("Thiago Pai", "123", new DateTime(23,8,94)));
        firstUserSet.add(new Usuario("Joao Neto", "123", new DateTime(25,10,95)));
        
        //Adding users to Set to be compared by birthday
        secondUserSet = new TreeSet<Usuario>(new BirthdayComparator());
        secondUserSet.addAll(firstUserSet);
        
        System.out.println("Sorted by NameComparator: ");
        UsersHandler.printOutUsers(firstUserSet);
        System.out.println("----------------------------------");
        System.out.println("Sorted by BirthdayComparator: ");
        UsersHandler.printOutUsers(secondUserSet);
        
    }
}
