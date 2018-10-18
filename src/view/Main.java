package view;

import Utils.LoginException;
import Utils.PasswordException;
import Utils.PersistenceException;
import business.control.UserControl;
import java.util.Scanner;

import business.model.User;
import mapas.DateTime;

public class Main {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        UserControl uc = new UserControl();
        int opc;
        
        try{
            uc.checkFile();
        }catch(PersistenceException pe){
            System.out.println(pe.getMessage());
            System.exit(0);
        }
         
        
        
        while(true){
            UserForm.menu();
            opc = Integer.parseInt(s.nextLine());
            
            switch(opc){
                case 1:
                    UserForm.menuAdd();
                    String login = s.nextLine();
                    UserForm.menuAddSenha();
                    String senha = s.nextLine();
                    
                    try {
                        uc.add(new User(login, senha, new DateTime(10, 10, 10)));

                    } catch (LoginException | PasswordException ex) {
                        System.out.println(ex.getMessage());
                    }

                    break;
                case 2:
                    UserForm.menuRemover();
                    String loginRemove = s.nextLine();
                    uc.removeUser(loginRemove);
                    break;
                case 3:
                    uc.print();
                    break;
                default:
                    UserForm.saving();
                    uc.close();
                    UserForm.exit();
                    return;
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
