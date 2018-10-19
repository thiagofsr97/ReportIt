package infra.persistence;

import Utils.PersistenceException;
import business.model.users.User;

import java.util.HashMap;

public interface Persistence {
    void saveOnDatabase(HashMap<String, User> data) throws PersistenceException;
    HashMap<String, User> loadFromDatabase() throws PersistenceException;
}
