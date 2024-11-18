import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiService {

    private static final String API_URL = "https://api.exchangerate-api.com/v4/latest/";

    public double getTaxaDeConversao(String moedaOrigem, String moedaDestino) {
        String apiKey = Config.getApiKey(); // Carregando a chave da API
        if (apiKey == null || apiKey.isEmpty()) {
            System.err.println("Chave da API não encontrada!");
            return -1;
        }

        try {
            URL url = new URL(API_URL + moedaOrigem + "?apiKey=" + apiKey);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            if (connection.getResponseCode() == 200) {
                InputStreamReader reader = new InputStreamReader(connection.getInputStream());
                JsonObject json = JsonParser.parseReader(reader).getAsJsonObject();
                JsonObject taxas = json.getAsJsonObject("rates");
                return taxas.get(moedaDestino).getAsDouble();
            } else {
                System.out.println("Erro na API: Código " + connection.getResponseCode());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1; // Retorna -1 em caso de erro
    }
}

