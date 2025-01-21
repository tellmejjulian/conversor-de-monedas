import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class Conversor {

    public double conversor(String a, String b, double cantidad) throws IOException, InterruptedException {
        // Implementación de conversión según las APIs de conversión de monedas

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/323fd279e2e66f8ad179e950/pair/" + a + "/" + b);

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            Map<?, ?> json2 = gson.fromJson(response.body(), Map.class);

            Double valorConvertido = (Double) json2.get("conversion_rate");

            return valorConvertido * cantidad;
        } catch (Exception e) {
            System.out.println("Error al conectar con la API: " + e.getMessage());
            return -1;
        }
    }
}