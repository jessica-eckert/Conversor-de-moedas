import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;

public class Config {
    public static String getApiKey() {
        try {
            FileReader reader = new FileReader("src/config.json");
            JsonObject json = JsonParser.parseReader(reader).getAsJsonObject();
            return json.get("apiKey").getAsString();
        } catch (Exception e) {
            System.err.println("Erro ao carregar a chave da API: " + e.getMessage());
            return null;
        }
    }
}


