/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapas;

import business.model.User;

import java.util.Comparator;

/**
 *
 * @author aluno
 */
public class NameComparator implements Comparator<User> {

    public int compare(User o1, User o2) {
        int result = o1.getlogin().compareTo(o2.getlogin());
        if (result == 0){
            return o1.getPassword().compareTo(o2.getPassword());
        }
        return result;       
    }
    
    
}
