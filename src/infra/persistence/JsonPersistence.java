package infra.persistence;

import Utils.PersistenceException;
import business.model.users.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;


import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class JsonPersistence implements Persistence {
    private static final String PATH = "./src/databasefiles/";

    private String mapToJson(Map<String, User> userMap) {
        Gson gson = new GsonBuilder().setPrettyPrinting()
                .create();

        return gson.toJson(userMap);
    }

    private HashMap<String, User> jsonToMap(String json) {
        Gson gson = new Gson();
        Type usersMapType = new TypeToken<HashMap<String, User>>(){}.getType();

        return gson.fromJson(json, usersMapType);
    }


    @Override
    public void saveOnDatabase(HashMap<String, User> data) throws PersistenceException {

        String json = mapToJson(data);

        try {
            Files.write(Paths.get(PATH), json.getBytes());
        } catch (IOException e) {
            throw new PersistenceException("Não foi possível criar o banco de dados JSON.");
        }


    }

    @Override
    public HashMap<String, User> loadFromDatabase() throws PersistenceException {
        String json;
        try {
            json = new String(Files.readAllBytes(Paths.get(PATH)));
        } catch (IOException e) {
            return new HashMap<>();
        }

        return jsonToMap(json);
    }
}
