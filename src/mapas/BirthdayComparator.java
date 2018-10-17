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
public class BirthdayComparator implements Comparator<Usuario> {

    public int compare(Usuario o1, Usuario o2) {
        if(o1.getBirthday().getYear() > o2.getBirthday().getYear())
            return 1;
        else if(o1.getBirthday().getYear() < o2.getBirthday().getYear())
            return -1;
        else{
            if(o1.getBirthday().getMonth()> o2.getBirthday().getMonth())
                return 1;
            else if(o1.getBirthday().getMonth()< o2.getBirthday().getMonth())
                return -1;
            else{
                if(o1.getBirthday().getDay()> o2.getBirthday().getDay())
                    return 1;
                else if(o1.getBirthday().getDay()< o2.getBirthday().getDay())
                    return -1;
                
                return 0;
            }
        }
    }
    
    
}
