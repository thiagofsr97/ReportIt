package infra;

import Utils.PersistenceException;
import business.model.User;

import java.util.HashMap;
import java.util.Map;

public interface Persistence {
    void saveOnDatabase(HashMap<String, User> data) throws PersistenceException;
    HashMap<String, User> loadFromDatabase() throws PersistenceException;
}
