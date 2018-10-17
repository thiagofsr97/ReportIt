
package view;


public class UserForm {
    
    public static void menu(){
        System.out.println("\n\nBEM-VINDOS AO GLORIOSO PROGRAMA DA AULA DE MPS");
        System.out.println("Digite 1 para adicionar novo usuário.");
        System.out.println("Digite 2 para remover um usuário.");
        System.out.println("Digite 3 para visualizar os usuários.");
        System.out.println("Digite outro valor para sair e salvar.");
    }
    
    public static void menuAdd(){
        System.out.println("Digite o nome do usuário.");
    }
    
    public static void menuAddSenha(){
        System.out.println("Digite a senha. ");
    }
    
    public static void menuRemover(){
        System.out.println("Digite o nome do usuário que vai sair do sistema.");
    }
    
    public static void saving(){
        System.out.println("Salvando dados...");
    }
    
    public static void exit(){
        System.out.println("Dados salvos com sucesso!\nVolte sempre, meu camarada!\n");
    }
}
