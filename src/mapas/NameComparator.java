/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapas;

import java.util.Comparator;

/**
 *
 * @author aluno
 */
public class NameComparator implements Comparator<Usuario> {

    public int compare(Usuario o1, Usuario o2) {
        int result = o1.getlogin().compareTo(o2.getlogin());
        if (result == 0){
            return o1.getPassword().compareTo(o2.getPassword());
        }
        return result;       
    }
    
    
}
