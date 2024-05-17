package stmichel;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

public class JoursFeriesService {

    private static final String API_URL = "https://cdn.jsdelivr.net/npm/@fawazahmed0/currency-api@latest/v1/currencies/eur.json";

    public Map<String, String> getJoursFeries(int annee) {
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(API_URL + annee);
            String jsonResponse = client.execute(request, httpResponse -> 
                EntityUtils.toString(httpResponse.getEntity()));
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(jsonResponse, Map.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
