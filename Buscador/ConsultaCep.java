package Buscador;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class ConsultaCep {

    public Endereco buscaEndereco(String cep) {
        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json/");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = HttpClient.newHttpClient().send(
                    request,
                    HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
            return new Gson().fromJson(response.body(), Endereco.class);

        } catch (Exception e) {
            throw new RuntimeException("N\u00e3o consegui obter o endere\u00e7o para o CEP " + cep, e);
        }
    }
}
