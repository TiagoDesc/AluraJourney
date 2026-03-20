package Buscador;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GeradorDeArquivo {

    public void salvaJson(Endereco endereco) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Path arquivo = Path.of(endereco.cep() + ".json");
        Files.writeString(arquivo, gson.toJson(endereco), StandardCharsets.UTF_8);
    }
}
