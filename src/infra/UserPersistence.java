
package infra;

import Utils.PersistenceException;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import mapas.Usuario;

public class UserPersistence {
    
    private FileInputStream fileStream;
    private ObjectInputStream input;
    private ObjectOutputStream output;
    private boolean continua = true;
    private boolean moreRecords = true;
    private HashMap<String, Usuario> data;
    private String _path;

    public UserPersistence(String _path) {
        this._path = _path;
    }

   
    public HashMap<String, Usuario> getDadosUsuario() {
        return data;
    }

    public boolean getContinua() {
        return continua;
    }

  
public void setupLer(String arquivo) throws PersistenceException{

    //Abre arquivo para leitura

      try {
            fileStream = new FileInputStream(arquivo);
            input = new ObjectInputStream(fileStream);
        }
      catch (EOFException eof) {
            continua = false; //arquivo está vazio
        }
      catch (IOException e) {
            throw new PersistenceException("Falha na abertura de arquivo para leitura. " + e.getMessage());
        }
    }
    
    
public void readRecords() throws PersistenceException{

    //Carrega todo o conteúdo do arquivo na Coleção produto

    try {
        
        while (moreRecords) 
            data = ((HashMap<String, Usuario>)(input.readObject()));
        System.out.println("Terminou de ler");

    } catch (EOFException eof) {

         moreRecords = false;

    } catch (IOException e) {

         throw new PersistenceException("Erro durante leitura do arquivo. " + e.getMessage());

    } catch (ClassNotFoundException ex) {
        System.out.print("");
    }
}

public void cleanupLer() throws PersistenceException{

//Fechar o arquivo, após ter sido descarregado na coleção

    try {

        input.close();

    }catch (IOException e) {

        throw new PersistenceException("Falha no fechamento do arquivo durante leitura. " + e.getMessage());

    }

}

public void setupGravar(String arquivo) throws PersistenceException{

//Abre arquivo para gravar

    try{

        output = new ObjectOutputStream(new FileOutputStream(arquivo, false));

    }catch (IOException e) {
        throw new PersistenceException("Falha na abertura do arquivo para gravação. " + e.getMessage());
    }
}

public void addRecords1(HashMap<String, Usuario> data) throws PersistenceException{

//Carrega toda a coleção no arquivo

    try {
        output.writeObject(data);
    }catch (IOException e) {
        throw new PersistenceException("Erro durante a gravação no arquivo. "+ e.getMessage());
    }
}
    public boolean isFile(String fileName) throws PersistenceException{ //Esse método serve para criar um novo arquivo caso não exista
        if(!new File(fileName).isFile())
            throw new PersistenceException("Arquivo não encontrado em: " + _path);
        return true;
            
    }

    public void cleanupGravar() throws PersistenceException{

    //Fechar o arquivo, após todos os objetos terem sido gravados

    try {
        output.flush();
        output.close();

    }catch (IOException e) {
        throw new PersistenceException("Falha no fechamento do arquivo ao gravar." + e.getMessage());
       }

    }
}
